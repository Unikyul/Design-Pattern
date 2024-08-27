package ex09;

public class App {
    public static void main(String[] args) {

        //builder (순서 상관없이 가독성이 좋아진다.)
        //생성자 단점
        // 1. 순서를 기억
        // 2. ex)아이디를 안 넣고 싶고 eamil,age만 넣고 싶으면 따로 email.age 를 만들어야 한다.
        // 데이터 덩어리들을 만들때 기본변수를 쓰지 않는게 좋다
        // Person t1 = Person.builder().id(1).name("홍길동").age(50).email("abc@naver.com");
        //Overroding 할 필요가 없다.


        Person p1 = Person.builder().name("홍길동").email("ssar@nate.com");
        System.out.println(p1.getAge());

    }
}
