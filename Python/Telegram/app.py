from flask import Flask, render_template, request
from decouple import config
import requests
import random

app = Flask(__name__)

token = config('TELEGRAM_BOT_TOKEN')
chat_id = config('CHAT_ID')

app_url = f"https://api.telegram.org/bot{token}"


# root
@app.route("/")
def hello():
    return "안녕하세요!"

@app.route("/write")
def write():
    #HTML
    return render_template("write.html")

@app.route("/send")
def send():
    message = request.args.get("message")
    message_url = app_url + f"/sendMessage?chat_id={chat_id}&text={message}"
    # message 받아서 telegram 메시지 보내는 요청
    requests.get(message_url)
    return "메시지  전송 완료"

# Webhook
@app.route(f"/{token}", methods=['POST'])
def telegram():
    print(request.get_json())
    
    # 실습 1 : 사용자의 아이디랑 텍스트 가져오기
    response = request.get_json()
    user_id = response["message"]["chat"]["id"]
    user_text = response["message"]["text"]
    # 앵무새
    # 실습 2 : 텔레그램 메시지 보내기 요청
    #send(user_id,user_text)
    

    # if 만약 /로또 입력이되면 text > 6개 숫자를 추천
    if user_text == "/로또" :
        lotto_num = sorted(random.sample(range(1,46), 6))
        user_text = lotto_num

    elif user_text == "/점심" :
        menus = ["20층", "양자강", "맥도날드", "바스버거"]
        user_text = random.choice(menus)

    message_url = app_url + f"/sendMessage?chat_id={user_id}&text={user_text}"
    requests.get(message_url)

    return '', 200







# debug
if __name__ == "__main__":
    app.run(debug=True)