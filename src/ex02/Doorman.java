package ex02;


/**
 * 문지기한테 DIP만 지켜줘라는 뜻은
 * 하나만 지키게 하라 즉 Animal이라는 부모에 속한 쥐, 호랑이들을
 * App인 큰 틀에서 책임지게 만들어라는 뜻!
 */
public class Doorman {

    // 쥐 출입금지
    public void 쫒아내(Animal m) {  // OPC를 지켜야한다.      System.out.println("안녕");

        System.out.println(m.getName() + "쫒아내");
    }
}
