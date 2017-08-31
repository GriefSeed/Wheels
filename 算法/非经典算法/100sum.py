'''
编写一个在1，2，…，9（顺序不能变）数字之间插入+或-或什么都不插入，使得计算结果总是100的程序，并输出所有的可能性。例如：1 + 2 + 34 – 5 + 67 – 8 + 9 = 100
'''
def f_2():  
    L = ['+','-','']  
    for i1 in L:  
        for i2 in L:  
            for i3 in L:  
                for i4 in L:  
                    for i5 in L:  
                        for i6 in L:  
                            for i7 in L:  
                                for i8 in L:  
                                    a = '1%s2%s3%s4%s5%s6%s7%s8%s9'%(i1,i2,i3,i4,i5,i6,i7,i8)  
                                    if eval(a)==100:  
                                        print(a,'=100')  
#------------------------------------------------------------------------------------


from itertools import product
def sum_100():
    result, number = [], range(1, 10)
    for item in product(['+', '-', ''], repeat=8):
        number_tuble = zip(number, item + ('',))
        combine = ''.join([str(x) + y for x, y in number_tuble])
        if eval(combine) == 100:
            result.append(combine + "=100")
    return result
f_2()
'''
l = sum_100()
for i in l:
    print(i)
'''