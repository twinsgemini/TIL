# Button Event 처리

**1. Layout 형태**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="10pt"
        android:text="클릭되면 바뀌어요"
        android:id="@+id/textview"/>
    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/eventBtn"
        android:text="@string/button"/>
</LinearLayout>
```

TextView 와 Button 을 각각 생성

화면은 다음과 같다.

![클릭 전 화면](./image/버튼이벤트처리_01.png)

BUTTON 클릭 시 "클릭되면 바뀌어요" 의 문구를 변화시킬 예정.



**2. 외부 클래스 사용**

```java
public class ButtonActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // TextView객체에 대한 reference를 얻어오기
        TextView tv = (TextView)findViewById(R.id.textview);
        // Event Source 객체부터 얻어오기 (id를 이용)
        Button myBtn = (Button) findViewById(R.id.eventBtn);
        // Event Handler 객체를 생성
        MyEventHandler handler = new MyEventHandler(tv);
        // Event Source에 Event Handler 객체를 생성해서 Event Handler를 부착
        myBtn.setOnClickListener(handler);
    }
}
class MyEventHandler implements View.OnClickListener{

    private TextView tv;

    // default constructor
    MyEventHandler(){
    }
    MyEventHandler(TextView tv){
        this.tv = tv;
    }
    
    @Override
    public void onClick(View v) {
        // 여기서 이벤트 처리 코드를 작성
        // TextView의 내용 변경
        tv.setText("change text");
    }
}
```



**3. 익명 내부 클래스(Anonymous Inner Class) 사용**

```java
public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // TextView객체에 대한 reference를 얻어오기
        final TextView tv = (TextView)findViewById(R.id.textview);
        // => final을 써어 tv변수를 상수화시켜 (heap)메모리에 계속 유지시켜준다. 그렇지 않을 경우 onClick() method에서 tv변수 사용 불가.

        // Event Source 객체부터 얻어오기 (id를 이용)
        Button myBtn = (Button) findViewById(R.id.eventBtn);

        // Event Source에 Event Handler 객체를 생성해서 Event Handler를 부착
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("change text");
            }
        });
    }
}
```



**4. 실행 화면**

![클릭 전 화면](./image/버튼이벤트처리_01.png)

![클릭 후 화면](./image/버튼이벤트처리_02.png)



