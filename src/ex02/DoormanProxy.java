package ex02;

public class DoormanProxy{

    private Doorman doorman;

    public DoormanProxy(Doorman doorman) {

        this.doorman = doorman;

    }

    public void 쫒아내(Animal a){
        System.out.println("안녕~~~");
        doorman.쫒아내(a);

    }

}
