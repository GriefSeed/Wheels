'''
前提：
构建一个二维数组，从上到下，从左到右递增

正式问题：
在一个二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
'''

#输入二维数组大小，从上到下，从左到右递增, n 是列， m 是行
m, n = 5, 3

#构建二维数组
list = [[[] for i in range(m)] for i in range(n)]

#构建生成数据的一维数组
result=[i for i in range(m * n)]

#构建下标
index = 0

#将一维数组的目标填入二维数组中
for i in range(n):
    for j in range(m):
        list[i][j] = result[index]
        index = index + 1

#print(len(list[0]))
#print(len(list))   

'''
#输出二维数组的数据
for i in range(n):
    for j in range(m):
        print(list[i][j])    
'''
#正式算法,从左下角开始，先跟上面的比较，如果比target大，就往上，如果上面比target小，就跟右边的比较，直到找到目标, 不过这思路有BUG，因为第二行的第一个数不一定比第一行的都大,所以还是老老实实地对每一行用二分法
def searchNum(target, list):
    #横长
    cLen = len(list[0])
    #列长
    lLen = len(list)
    clLen = 0
    while cLen >= 0 && lLen > clLen :
        if list[cLen][] 
