import tkinter,random,time

def mouse_move(e):
	global flag 
	if flag: 
		flag=False
		marusen()
	else: 
		flag=True
		off()

def off():
	global root,flag
	marusen()
	if flag: root.after(300,off)

def none():
	global canvas
	canvas.delete("all")

def maru(x,y,r):
	global canvas
	one=canvas.create_oval(x-40,y-40,x+40,y+40,fill=r)

def marusen():
	r=random.randint(1,6)
	if r==1: maru1()
	if r==2: maru2()	
	if r==3: maru3()
	if r==4: maru4()
	if r==5: maru5()
	if r==6: maru6()

def maru1():
	none()
	maru(200,200,"red")

def maru2():
	none()
	maru(100,100,"black")
	maru(300,300,"black")

def maru5():
	none()
	maru(100,100,"black")
	maru(300,300,"black")
	maru(300,100,"black")
	maru(100,300,"black")
	maru(200,200,"black")

def maru3():
	none()
	maru(100,100,"black")
	maru(300,300,"black")
	maru(200,200,"black")

def maru4():
	none()
	maru(100,100,"black")
	maru(300,300,"black")
	maru(300,100,"black")
	maru(100,300,"black")

def maru6():
	none()
	maru(100,100,"black")
	maru(300,300,"black")
	maru(300,100,"black")
	maru(100,300,"black")
	maru(100,200,"black")
	maru(300,200,"black")

root = tkinter.Tk()
root.title("サイコロ")
root.geometry("500x500")
root.bind("<Button-1>", mouse_move)
root.resizable(0,0)

canvas=tkinter.Canvas(root,width=400,height=400,bg="white",relief=tkinter.SOLID, bd=5)
canvas.pack(padx=50,pady=50)

maru1()
flag=False

root.mainloop()

