def rect(a,b):
	return a*b

def chouhoukei(w,h):
	return rect(w,h)

def seihoukei(a=7):
	return rect(a,a)

print(rect(2,3))
print(seihoukei(6))
print(seihoukei())
print(chouhoukei(w=5,h=6))

