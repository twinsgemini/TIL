# Android를 구성하는 4가지 Component

1. **Activity** 
   - Android App의 화면 1개
   - UI를 담당하는 component
   - 사용자의 Event처리를 담당 
   - load가 많은 작업처리를 하면 안된다
2. **Service**
   - 내부 로직 처리를 담당
   - DB 연결, 네트워크 연결
   - 사용자와의 interaction은 담당하지 않는다
   - 일반적으로 background에서 로직처리를 담당
3. **Broadcast Receiver**
   - 안드로이드 시스템에서 발생되는 여러가지 broadcast(신호)를 받아서 적절한 처리를 하는 component

4. **Content Provider & Resolver**
   - 모든 Android App은 sandbox model을 이용
   - App간의 데이터 공유
