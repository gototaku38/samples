from reportlab.pdfgen import canvas
from reportlab.lib.pagesizes import A4, portrait
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
import os
from reportlab.lib.units import inch, mm, cm
import webbrowser
import random

r=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
for i in range(0,20): r[i]=random.randint(1,11)


# ユーザのデスクトップのディレクトリを取得
file = "たし算.pdf"
file_path =file

# A4の新規PDFファイルを作成
page = canvas.Canvas(file_path, pagesize=portrait(A4))

# フォントの読み込み
pdfmetrics.registerFont(TTFont("HGRGE", "C:/Windows/Fonts/HGRGE.TTC"))
pdfmetrics.registerFont(TTFont("HGRME", "C:/Windows/Fonts/HGRME.TTC"))

for t in range(1,3):

	# フォントの設定(第1引数：フォント、第2引数：サイズ)
	page.setFont("HGRGE", 5*mm)

	# 指定座標が左端となるように文字を挿入
	page.drawString(20*mm, 280*mm, "計算プリント")

	# 線の太さを変更
	page.setLineWidth(0.5*mm)

	page.drawString(120*mm,270*mm, "名前")
	if t==2: page.drawCentredString(160*mm,270*mm,"解答")
	page.line(130*mm,268*mm,190*mm,268*mm)

	# 線の色の変更(RBGを0～1の少数で指定)
	page.setStrokeColorRGB(0.0, 0.0, 0.0)

	for i in range(1,11):
		if t==1: page.drawString(20*mm, (260-(i-1)*25)*mm, "("+str(i)+")"+str(r[2*i-2])+"+"+str(r[2*i-1])+"=")
		else: page.drawString(20*mm, (260-(i-1)*25)*mm, "("+str(i)+")"+str(r[2*i-2])+"+"+str(r[2*i-1])+"="+str(r[2*i-2]+r[2*i-1]))

	page.showPage()

# PDFファイルとして保存
page.save()

webbrowser.open("sample.pdf")