# 成績データを辞書型で定義
records = { 
    'Tanaka':72, 'Yamada':65, 'Hirata':100, 
    'Akai':56, 'Fukuda':66, 'Sakai':80 }

w=0
for ten in records.values():
	w=w+ten

ave=w/len(records)

# 成績データの一覧と平均点との差を表示 --- (*2)
fmt = "| {0:<7} | {1:>4} | {2:>5}"
print("| 名前    | 点数 | 差")
for name, v in records.items():
    # 平均点との差を求める
    diff_v = v - ave 
    # 小数点以下を丸める --- (*3)
    diff_v = round(diff_v, 1)
    # 書式にそって出力 --- (*4)
    print(fmt.format(name, v, diff_v))
