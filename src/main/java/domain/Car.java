package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    /**
     * 랜덤값에 따라 전진할지 멈출지 결정하는 함수
     * 전진하면 position은 1증가한다.
     */
    public void goOrStop(){
        int ran=(int)Math.random()*10;
        if(ran>=4){
            position++;
        }
    }

}
