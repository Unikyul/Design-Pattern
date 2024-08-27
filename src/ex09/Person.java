package ex09;

public class Person {


    // 클래스 자료형 데이터를 만들었다고 생각! 일반적으로 VO
    // null을 넣을 수 있는게 좋다. 그래서 int변수는 Integer 넣는게 좋다.
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    private Person(){

    }

    public static Person builder(){

        return new Person();

    }

    //자기자신을 다시 리턴을 한다. this를 자기자신을 가르킨다.
    public Person id(Integer id){
        this.id = id;
        return this;

    }
    public Person name(String name){
        this.name = name;
        return this;

    }
    public Person age(Integer age){
        this.age=age;
        return this;

    }
    public Person email(String email){
        this.email = email;
        return this;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
