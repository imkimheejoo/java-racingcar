
## 2주차 과제 '자동차 경주게임'
### 게임진행 과정
```bash
- 1) n대의 자동차의 이름을 입력한다.
    - 이름은 5자 이하만 가능하다.
    - 자동차의 이름은 쉼표를 기준으로 구분한다.
    
- 2) 사용자가 입력한 수만큼 자동차는 멈추거나 전진한다.
    - 이때 값이 4이상이면 전진하고 3이하면 멈춘다
    - 한번의 액션(전진/멈춤)을 할 때 마다 결과를 출력한다.
    
- 3) 입력한 수만큼 전진/멈춤하면 가장 많이 전진한 자동차의 이름을 출력한다.
```

### 기능 구현
#### Car 객체
- 전진 또는 멈춤을 결정하는 값을 구하여 position을 결정하는 함수
- 자동차의 전진현황을 출력하는 함수
- position의 크기에 따라 Car객체를 비교하는 Compare함수
```bash
position 값의 내림차순으로 정렬
```

#### MainClass
- 자동차의 이름이 모두 5자 이하인지 판별하는 함수
```bash
하나라도 이 조건을 충족하지 못하면 입력을 다시 받는다.
```
- 모든 자동차의 액션(멈춤/전진)을 실행시키는 함수
- 모든 자동차의 position을 출력하는 함수
- 우승자를 판별하는 함수
