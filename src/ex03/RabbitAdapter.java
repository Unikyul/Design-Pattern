package ex03;

import ex03.lib.OuterRabbit;

public class RabbitAdapter extends Animal {
    private OuterRabbit rabbit;

    public RabbitAdapter(OuterRabbit rabbit) {
        this.rabbit = rabbit;
    }

    //호환시키는 코드
    @Override
    public String getName() {
        return rabbit.getFullname();
    }
}
