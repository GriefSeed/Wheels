'''# 冒泡排序
aimList = [8, 8, 7, 6, 5, 4, 3, 2, 1]

# 记录数组长度，每排一个就减去一个，直至为0
nonSortLen = len(aimList)
# 使用两个游标
firstCursor = 0
secondCursor = 1

# 比较两个游标的大小，不断遍历，同时nonSortLen的长度减1
while nonSortLen > 0:
    while secondCursor <= nonSortLen - 1:
        # 如果前面那个大于后面那个，就置换
        if aimList[firstCursor] > aimList[secondCursor]:
            aimList[firstCursor], aimList[secondCursor] = aimList[secondCursor], aimList[firstCursor]
        firstCursor = firstCursor + 1
        secondCursor = secondCursor + 1
    nonSortLen = nonSortLen - 1
    # 游标重置
    firstCursor = 0
    secondCursor = 1

for i in aimList:
    print(i, end=' ')
print()'''

# 简化版

aimList = [8, 8, 7, 6, 5, 4, 3, 2, 1]


def bubbleSort(aimList):
    for i in range(len(aimList))[::-1]:
        for j in range(i):
            # 因为range从0开始，即是下标的下标，所以不会下标溢出
            if aimList[j] > aimList[j + 1]:
                aimList[j + 1], aimList[j] = aimList[j], aimList[j + 1]

bubbleSort(aimList)
for i in aimList:
    print(i, end=' ')
