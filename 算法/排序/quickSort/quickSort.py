'''
快速排序

核心：将第一个数作为key，对每一个key进行处理，对小于key的放其左边，大于的放右边,key永远是中间那个

实现：使用分治——递归——顺序处理

'''


def quickSort(aimList, headerIndex, lastIndex):
    if headerIndex == lastIndex:
        return
    else:
        # 对List进行快速排序，直到前下标与后下标相等，然后作为中间下标返回

        # 进行递归调用,排完左边，排右边
        quickSort(aimList, 0, midIndex - 1)
        quickSort(aimList, midIndex, len(aimList) - 1)


aimList = [7, 1, 5]

print(len(aimList))
quickSort(aimList, 0, len(aimList) - 1)
for i in aimList:
    print(i, end=' ')
