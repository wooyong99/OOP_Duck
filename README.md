## OOP Duck

![image](https://github.com/wooyong99/OOP_Duck/assets/85385921/20058f48-732d-4f21-873f-cb6ec9c7e0d0)

## 요구사항

- ```java.awt.Frame```라이브러리를 활용하여 랜덤으로 10개의 MallardDuck과 RedDuck을 생성해서 보여주세요.
- MallardDuck은 파란색, RedDuck은 빨간색으로 출력해주세요.
- 랜덤으로 생성된 Duck 객체를 몇 번째로 생성된 객체인지 함께 출력해주세요.

## 추가된 요구사항

![image](https://github.com/wooyong99/OOP_Duck/assets/85385921/b0ec6af7-a002-4c2c-811b-903daa83d9cf)

- 20개의 Duck을 생성해주세요.
- 모든 오리는 자신의 모양대로 출력할 수 있다.
- 모든 오리는 수영할 수 있다.
- MallardDuck과 RedDuck은 꽥꽥, RubberDuck은 삑삑 소리를 낼 수 있다.
- MallardDuck과 RedDuck 타입의 오리만 날 수 있다.
- <u>날지 못하고 소리는 낼 수 있는</u> 오리는 사각형으로 출력한다.
- DecoyDuck은 딱딱으로 소리낼 수 있다.
- Reduck도 사각형으로 출력해주세요.

## 객체 역할 및 책임 부여

- ```MyFrame``` : GUI프레임 생성, 이벤트 처리, DuckList 관리, Duck객체 표시
- ```Duck``` : 랜덤 Duck 생성, 수영, 소리, 그리기하기

## 설계 방법
#### 1. 객체 추출
  1. main object
  2. 20개의 duck object -> **스타일 4가지** -> **4개의 Class 필요**
  3. java.awt.Frame
#### 2. 객체 역할 정의 -> Class 정의
#### 3.  설계 완료 -> 구현 시작
  
## 결과

![image](https://github.com/wooyong99/OOP_Duck/assets/85385921/0f7fdc8c-b400-4005-8b00-966a7fa55502)





