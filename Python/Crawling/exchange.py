#실습. 환율 정보 가져오기

import requests
from bs4 import BeautifulSoup as bs 


#exchangeList > li.on > a.head.usd > div > span.value
url = "https://finance.naver.com/marketindex/"
response = requests.get(url).text
soup = bs(response, 'html.parser')

a = soup.select_one("#exchangeList > li.on > a.head.usd > div > span.value")

print(f"현재 원/달러 환율은 {a.text} 입니다.")

# 파일 저장
with open('test.txt', 'w', encoding='utf-8') as f :
    f.write(f"현재 원/달러 환율은 {a.text} 입니다.")