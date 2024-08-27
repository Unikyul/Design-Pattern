package ex00;

class 앨리스 {
    private int 목마름; // 상태는 변경 X

    public 앨리스(int 목마름) {  //객체
        this.목마름 = 목마름;
    }

    void 물마시기() {  // heap에 저장되어있다. 의도를 파악하기 좋다. set로 할 필요 없다.
        목마름 = 0;
    }
    int 목마름확인하기(){           //getter는 꼭 필요하다
        return 목마름;
    }
}

public class Memo01 {
    public static void main(String[] args) {
        앨리스 e = new 앨리스(100); // 9번 라인에서 동적할당 (heap), main 앨리스
         // 1. 값 변경(행위)
          e.물마시기();


        // 2. 값 확인
        int 목마름 = e.목마름확인하기();
        System.out.println(목마름);
    }
}
