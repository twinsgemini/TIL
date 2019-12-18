# print() happy hacking!

hphk = "해피해킹"
print(hphk)
print(hphk)
print(hphk)
print(hphk)
print(hphk)

# 점심메뉴판!

menus1 = "순남 시래기"
menus2 = "양자강"
menus3 = "20층..."

print(menus1)
print(menus2)
print(menus3)

# List
menus = ["순남 시래기", "양자강", "20층..."]
print(menus)
print(menus[0])

# 전화번호부 저장하기

phone_nums = ["02-0216-1111", "02-0216-2222", "02-0216-3333"]
print(phone_nums)

# Dictionary

dict_nums = {"순남 시래기" : "02-0216-1111", 
    "양자강" : "02-0216-2222", 
    "20층":"02-0216-3333"
    }

print(dict_nums["순남 시래기"])

#print(dict_nums['ㅎㅎ']) -> 오류발생
print(dict_nums.get('ㅎㅎ')) # -> none값