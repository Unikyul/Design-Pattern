package ex04;

/**
 *
 * Animal 생성 (abstract)
 * 타입 일치(다형성) = 쥐(동물), 호랑이(동물)
 * 문지기한테 DIP만 지켜주면 됨
 */



public class App {
    public static void main(String[] args) {
        Doorman d1 = Doorman.instance;
        Doorman d2 = Doorman.instance; // new 두번 하는 거 막기 (싱클톤 패턴)

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

    }
}
