package www.Study.Day07.Test;

public class BasketBallCoach extends Coach{
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teacher() {
        System.out.println("篮球教练教篮球");
    }
}
