import tkinter,incounter

def mouse_move(e):
	w=incounter.counter()
	lbl["text"] = "click:"+w

root = tkinter.Tk()
root.title("ためし")
root.geometry("800x600")
root.bind("<Button-1>", mouse_move)

w=incounter.r()
# ラベルの作成と配置
lbl = tkinter.Label(root, text="", 
				borderwidth=2, relief="ridge")
lbl.place(x=20, y=20, width=260, height=30)

lbl["text"] ="click:"+w


root.mainloop()


