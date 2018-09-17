package day13.TrainOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Train5 {
    public static void main(String[] args) {
        // 创建集合:list
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张无忌", "李四", "张飞", "张三", "老王");

        List<String> resultList = fileter(list, s -> s.startsWith("张"), s -> s.length() == 2);
        System.out.println(resultList);
    }

    public static List<String> fileter(List<String> stus, Predicate<String> one, Predicate<String> two) {
        // 创建集合:list
        List<String> list = new ArrayList<>();
        // 遍历集合：stus
        for (String stu : stus) {
            if (one.and(two).test(stu)) {
                list.add(stu);
            }
        }
        // 返回集合
        return list;
    }
}
