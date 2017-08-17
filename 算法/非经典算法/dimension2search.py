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
    
'''
#输出二维数组的数据
for i in range(n):
    for j in range(m):
        print(list[i][j])    
'''        