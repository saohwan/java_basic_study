package day12.abs;

//추상 클래스
public abstract class Car {

    public String model;
    private int price;

    public Car(int model, int price) {
        System.out.println("Car 생성자 호출!");

        this.price = price;
    }

    //추상 메서드 //바뀌면안될 기능 구현 //추상메서드를 설계하기 위해서는 클래스도 추상화 되어야한다.
    public abstract void start(); // 주행 기능 명세

    //스태틱 메서드 공통된 기능 구현
    public static void staticMet() {}
    public void instanceMet() {} //가져다 써도 되고 기능도 바꿔도됌.
    public final void finalMet() {} //가져다 써도되는데 기능은 바꾸지마
}

