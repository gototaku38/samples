import infile

def counter():
	r=infile.inread()
	s=int(r)+1
	r=str(s)
	infile.inwrite(r)
	return r

def r():
	rr=infile.inread()
	return rr