package ex00;


abstract class Car {
    // car 상태
    // car 행위
    abstract void run(); // 무효화
}

class tico extends Car {


    //오버라이딩!! 부모의 메소드 재정의 한다.
    void run() {
        System.out.println("티코 달린다.");
    }
}

class benz extends Car {

    //오버라이딩!! 부모의 메소드 재정의 한다.
    void run() {
        System.out.println("벤츠 달린다.");

    }
}

class Sonata extends Car { // 다형성
    // Sonata 상태
    // Sonata 행위

    //오버라이딩!! 부모의 메소드 재정의 한다
    void run() { // 재정의
        System.out.println("소나타 달린다");
    }
}

class Genesis extends Car { // 다형성
    // Genesis 상태
    // Genesis 행위

    //오버라이딩!! 부모의 메소드 재정의 한다
    void run() {
        System.out.println("제네시스 달린다");
    }
}

public class Memo02 {

    static void 레이싱(Car car) {
        car.run();
    }


    public static void main(String[] args) {
        Car s1 = new Sonata(); // Sonata, Car
        Car g1 = new Genesis(); // Genesis, Car
        Car t1 = new tico();
        Car b1 = new benz();

        레이싱(t1);
        레이싱(b1);
    }
}
