scopeList = input().split(" ")
start = int(scopeList[0])
end = int(scopeList[1])

for i in range(start, end):
    numList = list(str(i))
    sum = 0
    for j in numList:
        sum = sum + int(j) ** 3
    if sum == i:
        print(i, end=' ')