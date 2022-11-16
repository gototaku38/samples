def fact(n):
	if n==0:
		w=1
	else:
		w=n*fact(n-1)
	return w

print(fact(5))
