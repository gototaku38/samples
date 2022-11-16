def baisuu(a):
	i=a
	while(i<=30):
		yield i
		i=i+a

it=baisuu(3)
for v in it: print(v)
		