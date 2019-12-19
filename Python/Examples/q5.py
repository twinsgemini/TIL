'''
문제 5.
표준 입력으로 물품 가격 여러 개가 문자열 한 줄로 입력되고, 각 가격은 ;(세미콜론)으로 구분되어 있습니다.
입력된 가격을 높은 가격순으로 출력하는 프로그램을 만드세요.
# 입력 예시: 300000;20000;10000
'''

prices = input('물품 가격을 입력하세요: ')
# 아래에 코드를 작성해 주세요.
prices = prices.split(';')

boxes = [] # list > append() 사용
print(prices)
for price in prices:
    boxes.append(int(price))

print(sorted(boxes)) # sorted() : 원본데이터 보존
print(boxes)
boxes.sort(reverse=True) # .sort() : 원본데이터 수정
print(boxes)

'''
for i in range(len(prices)-1) :
    max_value = prices[i]
    
    for j in range(i+1,len(prices)) :
        if max_value < prices[j] :
            max_value = prices[j]
            max_p = j
    
    if max_value != prices[i] :
        tmp = prices[i]
        prices[i] = prices[max_p]
        prices[max_p] = tmp

print(prices)
'''
