package www.Study.Day07.Test;

public class PingPongSportsman extends Sportsman implements StudyEnglish{
    public PingPongSportsman() {
    }

    public PingPongSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
}
