import qrcode
img=qrcode.make("abcde")
img.save("qr-test.png")