year=int(input("何年ですか?"))

is_leap=False

if(year%4==0):
	is_leap=True
	if(year%100==0):
		is_leap=False	
		if(year%400==0):
			is_leap=True
	else:
		is_leap=True

if is_leap:
	print("うるう年")
else:
	print("うるう年でない")
