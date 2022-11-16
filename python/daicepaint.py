import tkinter
from PIL import Image, ImageDraw, ImageFont

class cicle:
	def __init__(self,x,y,r):
		self.a=x-r
		self.b=y-r
		self.c=x+r
		self.d=y+r


root = tkinter.Tk()
root.title("サイコロの目")
root.geometry("500x500")

im =Image.new("RGB", (400, 400), (255,255,255))
draw = ImageDraw.Draw(im)

for i in range(1,7):
	draw.rectangle((0,0,400,400), fill=(255,255,255))
	draw.line((0,0,400,0), fill=(0,0,0), width=10)
	draw.line((0,0,0,400), fill=(0,0,0), width=10)
	draw.line((0,400,400,400), fill=(0,0,0), width=10)
	draw.line((400,0,400,400), fill=(0,0,0), width=10)
	if i==1:
		en=cicle(200,200,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(255, 0, 0), outline=(0, 0, 0))
	if i==2:
		en=cicle(100,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))	
		en=cicle(300,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))				
	if i==3:
		en=cicle(100,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(200,200,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))	
		en=cicle(300,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))	
	if i==4:
		en=cicle(100,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(300,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))	
		en=cicle(300,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(100,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
	if i==5:
		en=cicle(100,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(300,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))	
		en=cicle(300,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(100,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(200,200,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
	if i==6:
		en=cicle(100,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(300,100,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))	
		en=cicle(300,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(100,300,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(100,200,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
		en=cicle(300,200,40)
		draw.ellipse((en.a,en.b,en.c,en.d), fill=(0, 0, 0), outline=(0, 0, 0))
	im.show()
	im.save("daice"+str(i)+".png", quality=95)

root.mainloop()


