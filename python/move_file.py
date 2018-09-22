# -*- coding: utf-8 -*-
__author__ = "css"

import os.path
import re
import sys
import hashlib
from multiprocessing import Process, Pool, Manager
import multiprocessing
from time import sleep
import time

# 改造目标
# 增加生产者消费者队列path_q

# 定义全局变量，错误文件数量
error_file_list = []


def copy_file(path_q):
    global error_file_list
    # 从互通队列里取得路径,path旧路径，target_path新路径
    # 不断循环，如果为空，就是生产者还没来得及放进，就睡眠1秒，还是为空，就结束，否则就取值执行复制
    while True:
        if path_q.empty():
            sleep(1)
            if path_q.empty():
                break
            else:
                continue
        else:
            path, target_path = path_q.get().get_all()
            with open(path, "rb") as origin_file, open(target_path, "wb") as target_file:
                try:
                    print("{0}正在写入........".format(target_path))
                    target_file.write(origin_file.read())
                except Exception as e:
                    print("文件{0}传输崩溃了......原因：{1}".format(target_file, e))
                    sys.exit()
            # 增加MD5文件校验,必须等文件流关闭后在检验
            if hashlib.md5(open(path, 'rb').read()).digest() == hashlib.md5(open(target_path, 'rb').read()).digest():
                print("{0}写入完毕........".format(target_path))
            else:
                error_file_list.append(target_path)
                raise Exception("{0}文件校验出错, 与原文件不一致........".format(target_path))


def get_path(path_q, old_root_path, new_root_path, ignored_file_regex):
    for root, dirs, files in os.walk(old_root_path):
        new_root = root.replace(old_root_path, new_root_path)
        if not os.path.exists(new_root):
            os.makedirs(new_root)
        # 将旧路径和新路径装进Item自定义POJO，然后装进队列
        for file in files:
            # 使用正则表达式过滤文件
            if ignored_file_regex.search(file) is None:
                # 装载, 如果队列满了会阻塞
                path_q.put(Item(os.path.join(root, file), os.path.join(new_root, file)))
            else:
                continue

    # 告诉队列完成了
    path_q.task_done()


class Item:
    old_path = ""
    new_path = ""

    def __init__(self, old_path, new_path):
        self.old_path = old_path
        self.new_path = new_path

    def get_all(self):
        return [self.old_path, self.new_path]


if __name__ == '__main__':

    # old_root_path = "D:\\tempBox\\ass\\uTorrent"
    # new_root_path = "D:\\tempBox\\ass\\uTorrent_copy"

    old_root_path = "E:\\LateLetter"
    new_root_path = "E:\\LateLetter2"

    # 进程互通队列
    path_q = Manager().Queue(800)

    # 正则表达式，剔除不要的文件后缀, 同时将正确的路径放入path_q
    ignored_file_regex = re.compile(r".*.itheima$|.*.itcast$")

    # 生成目录框架并创建文件路径队列
    print("正在生成目录列表...............请稍后")

    # 子进程，提取路径并塞进队列 path_q
    write = Process(target=get_path, args=(path_q, old_root_path, new_root_path, ignored_file_regex))
    write.daemon = True
    write.start()

    # 使用多进程分发任务
    process_list = []
    for i in range(multiprocessing.cpu_count()):
        process_list.append(Process(target=copy_file, args=(path_q,)))
    for i in process_list:
        i.daemon = True
        i.start()
    # 不分离会导致只有一个进程在工作
    for i in process_list:
        i.join()

    '''
        with ThreadPoolExecutor(max_workers=5) as pool:
        while len(path_q) > 0:
            old_file, new_file = path_q.pop().get_all()
            future = pool.submit(copy_file, old_file, new_file)
    '''

    if len(error_file_list) > 0:
        print("+++++++++++++++++++程序完成，但有{0}个文件出错,出错文件为+++++++++++++++++++++++++".format(len(error_file_list)))
        for i in error_file_list:
            print(i)
    else:
        print("##############程序运行完毕##############")
