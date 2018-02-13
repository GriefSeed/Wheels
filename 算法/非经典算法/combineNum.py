def combinNum(num, numList):
    numListTemp = numList
    maxNum = ''
    # 冒泡排序
    for i in range(len(numList))[::-1]:
        for j in range(i):
            last = len(numList) - 1 - j
            head = len(numList) - 2 - j
            if eval(str(numListTemp[last]) + str(numListTemp[head]) + '-' + str(numListTemp[head]) + str(numListTemp[last])) > 0:
                numListTemp[head], numListTemp[last] = numListTemp[last], numListTemp[head]

    for i in numListTemp:
       maxNum = maxNum + str(i)
    return maxNum


num = eval(input())
list = input().split(" ")

# list = ['12', '123']
print(combinNum(2, list))