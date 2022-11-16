def x20(i): return i%20

a=[10,20,30]
a.append(40)


b=map((lambda x:x*x),a)


c=filter(lambda x:(x%20)==0,a)

for i in a: print(i)
print("finish")

for i in b: print(i)
print("finish")

for i in c: print(i)
print("finish")