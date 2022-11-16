def inwrite(e):
	with open("intext\intext.txt",mode="w",encoding="utf-8") as f:
		f.write(e)

def inread():
	with open("intext\intext.txt",mode="r",encoding="utf-8") as f:
		t=f.read()
	return t	
