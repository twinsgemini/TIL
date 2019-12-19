import random
import json

# 설치 후 사용
import requests
from bs4 import BeautifulSoup as bs 


numbers = random.sample(range(1,46), 6)
print(numbers)

url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=836"

response = requests.get(url)
#print(type(response.text))

lotto = json.loads(response.text)
#print(type(lotto))

#print(lotto["drwtNo6"])
#print(lotto.get("drwtNo6"))

winner = []
for i in range(1,7) :
    winner.append(lotto.get(f"drwtNo{i}"))

print(winner)

def pickLotto():
    picked = sorted(random.sample(range(1, 46), 6))
    matched = len(set(winner) & set(picked))

    if matched == 6 :
        print("1등")
    elif matched == 5 :
        print("3등")
    elif matched == 4 :
        print("4등")
    elif matched == 3 :
        print("5등")
    else :
        print("꽝")
    
pickLotto()