from gtts import gTTS

def sound_make(s):
		name=s+".mp3"
		tts=gTTS(s,lang="en")
		tts.save(name)

#a=input("英単語を入力してください。")
#sound_make(a)