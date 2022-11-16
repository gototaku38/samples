def sun(*suu):
	w=0
	for i in suu:
		w=w+i
	return w

def ave(*suu):
	w=sun(*suu)
	c=counter(*suu)
	return w/c

def counter(*suu):
	c=0
	for i in suu:
		c=c+1
	return c

def bekiseki(*suu):
	w=1
	for i in suu:
		w=w*i
	return w

def sun2(*suu):
	total=0
	for i in suu:
		toal=total+i*i
	return total

def wa(shiki):
	return shiki(2,3,4)

print(sun(1,2,3,4,5))
print(sun(1,2,3))

print(ave(1,2,3,4,5))
print(ave(1,2,3))

print(counter(1,2,3,4,5))
print(counter(1,2,3))

print(bekiseki(1,2,3,4,5))
print(bekiseki(1,2,3))

print(wa(counter))
print(wa(bekiseki))
