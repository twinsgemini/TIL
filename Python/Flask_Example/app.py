from flask import Flask, render_template, request
import datetime
import random
import requests

# 지금부터 flask 서버 이름은 APP 이다.
app = Flask(__name__)

# url을 관리해주는 친구 : @app.route("/")
@app.route("/")
def hello() :
    return "안녕!!"

# D-day 실습
@app.route("/dday")
def dday() :
    today = datetime.datetime.now() 
    print(today)
    final = datetime.datetime(2020, 6, 9)
    result = final - today
    print(result)
    return f"{result.days}일 남았습니다."

# is it christmas 실습
# "/christmas"
@app.route("/christmas")
def christmas() :
    today = datetime.datetime.now()
    day = today.date().strftime("%Y년 %m월 %d일")
    print(day)
    if (today.month == 12) and (today.day == 25) :
        return "<h1>Merry Christmas~!!</h1>"
    else :
        return f"<h1>Not Today...</h1><h2>Today : {day}</h2>"


'''
render_templ
def render_template(str, **args):

'''

@app.route("/movies")
def movies() :
    movies = ["겨울왕국2", "클라우스", "어바웃타임", "나홀로집에2", "러브액츄얼리"]
    return render_template("movie.html", movies=movies, text='영화 목록')


@app.route("/greeting/string:<name>") # string 생략가능
def greeting(name) :
    print(name)
    return f"안녕하세요! {name}님!"

@app.route("/cube/<int:num>")
def cube(num):
    result = num ** 3
    return str(result)

# 식사 메뉴 추천
# 1. random
# 2. DR_url : @app.route("/lunch/1,2,3,4(사람수)")
#   - List : ["자장면","짬뽕","오므라이스","볶음밥","고추잡채밥"]
#   - <int:num> 숫자 만큼 메뉴 뽑기

@app.route("/lunch/<int:num>")
def lunch(num):
    List = ["자장면","짬뽕","오므라이스","볶음밥","고추잡채밥","비빔밥","잔치국수"]
    
    food_no = []
    for i in range(num):
        food_no.append(random.randint(0,6))
    print(food_no)
    food_list = []
    for i in food_no :
        food_list.append(List[i])
    return render_template("lunch.html", food_list=food_list)



@app.route("/vonvon")
def vonvon():
    return render_template("vonvon.html")
@app.route("/gotmademe")
def gotmademe():
    name = request.args.get("name")
    print(name)
    ###
    first_list = ["못생김","어중간함","착하게생김","공부잘하게생김"]
    second_list = ["애교","잘난척","쑥스러움","자신감"]
    third_list = ["허세","식욕","찌질","돈복"]
    ###
    spoon=[]
    spoon.append(random.choice(first_list))
    spoon.append(random.choice(second_list))
    spoon.append(random.choice(third_list))
    print(spoon)
    return render_template("gotmademe.html", name=name, first=spoon[0], second=spoon[1], third=spoon[2])

# Debug Mode > python app.py
if __name__ == "__main__" :
    app.run(debug=True)
