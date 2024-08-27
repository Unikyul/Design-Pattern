package ex02;

/**
 * Animal 생성 (abstract)
 * 타입 일치(다형성) = 쥐(동물), 호랑이(동물)
 * 문지기한테 DIP만 지켜주면 됨
 */

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse(); //->mouse  animal
        DoormanProxy  doormanProxy = new DoormanProxy(new Doorman());
        doormanProxy.쫒아내(m);
    }
}
