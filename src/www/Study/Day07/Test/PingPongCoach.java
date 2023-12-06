package www.Study.Day07.Test;

public class PingPongCoach extends Coach implements StudyEnglish{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teacher() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球教练学习英语");
    }

    @Override
    public void speakingEnglish() {
        System.out.println("熟练的说英语");
    }
}
