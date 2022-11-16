i=50

def henka():
	i=30

def henka2():
	global i
	i=30

henka()
print(i)
henka2()
print(i)