'''
1. requests 사용 > naver.com 에 요청
2. response 에 저장 > bs4 사용하여 출력
3. webbrowser 
'''

import requests
from bs4 import BeautifulSoup as bs 

import webbrowser

url = "https://www.naver.com"
response = requests.get(url).text

# 'html.parser' : 받아올 형식
doc = bs(response, 'html.parser')

# html 요소
# . : class 값
# # : id 값
#result = doc.select_one('.ah_k')
result = doc.select('.ah_k')
#result = doc.select_one('#themecast')
#print(result)

#webbrowser.open(url)

search_rul = "https://search.naver.com/search.naver?query="
for i in range(3) :
    webbrowser.open(search_rul + result[i].text)