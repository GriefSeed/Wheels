def overTurnStr(str):
    overList = str.split(" ")[::-1]
    return overList

str = input()

print(" ".join(overTurnStr(str)))


''' print(" ".join(input().split(" ")[::-1])) '''