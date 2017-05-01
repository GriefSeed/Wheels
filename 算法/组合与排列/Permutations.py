def Permutations(headerIndex, lastIndex, aimList, num):
    # 递归结束条件的判断，排列的组合大小必定不大于所有元素的总个数
    if(len(aimList[lastIndex]) + 1 > num):
        pass
    else:
        # 生成新的组合，将原始字符放在每一个组合的前面，相同的去除
        for basicEle in aimList[:num - 1]:
            for existPer in [s for s in aimList[headerIndex:lastIndex] if basicEle not in aimList[headerIndex:lastIndex]]:
                aimList.append(list[key] + aimList[existPer])
        # 使用顺序递归
        Permutations(lastIndex + 1, len(aimList) - 1, aimList, num)


str = 'abc'
aimList = list(str)
Permutations(0, len(aimList) - 1, aimList, len(aimList))

for i in aimList:
    print(i, end=' ')
