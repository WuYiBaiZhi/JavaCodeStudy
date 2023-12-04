package www.Study.Day07.Test;

public class BasketBallSportsman extends Sportsman{
    public BasketBallSportsman() {
    }

    public BasketBallSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }
}
