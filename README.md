# Fcm(Firebase Cloud Messaging)
<br><br>
![image](https://github.com/j-ra1n/Fcm/assets/118893707/3dbaa3e8-b152-457b-a18c-57c3e2af275d)
<br><br>
1. 클라이언트에서 FCM에 등록을 요청
2. FCM은 Token을 클라이언트에게 발급한다.
3. 클라이언트는 앱서버에 자신의 정보와 해당 토큰을 전달하고 서버는 이를 맵핑하여 저장한다.
4. 맵핑된 정보를 토대로 앱서버는 푸시알림을 보내고 싶을때 클라이언트의 요청없이 FCM에 요청을 보낸다.
5. FCM은 AppServer에서 받은 토큰으로 해당 클라이언트를 찾아 푸시알림을 보낸다.

<br><br>
클라이언트가 가진 앱마다 FCM에서 받은 토큰은 모두 다르다는 것이다.
토큰은 스마트폰 자체에서 FCM으로 요청하는 것이 아닌 설치된 앱에서 요청을 하기 때문이다.
AppServer가 Token을 알게 된다면 이제 클라이언트의 요청을 받을 필요가 없어진다.
<br><br>
<br><br>
테스트시 주의할점:
앱은 기본적으로 Foreground, Background 상태를 지님
- Foreground: 앱을 실행시키고 앱의 UI가 노출되는 상태, 사용자가 조작가능
- Background: 홈버튼을 눌러 앱을 종료하거나 다른 앱으로 전환했을 때, 앱을 키지않으면 사용자가 조작 불가능
<br><br><br>
Background fcm 테스트 -> (안드로이드(프론트) 추가 세팅해야함)
![스크린샷 2024-03-29 191013](https://github.com/j-ra1n/Fcm/assets/118893707/e1f9723d-a7ff-4088-b612-068802146122)
