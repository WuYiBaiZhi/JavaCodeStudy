package www.Study.Day07.Test;

public class Test {
    public static void main(String[] args) {
        PingPongSportsman pingPongSportsman = new PingPongSportsman("张三",28);
        pingPongSportsman.show();
        pingPongSportsman.study();
        pingPongSportsman.studyEnglish();
        pingPongSportsman.speakingEnglish();
        PingPongCoach pingPongCoach = new PingPongCoach("李四", 32);
        pingPongCoach.show();
        pingPongCoach.teacher();
        pingPongCoach.studyEnglish();
        pingPongCoach.speakingEnglish();

        BasketBallSportsman basketBallSportsman = new BasketBallSportsman("王五", 21);
        basketBallSportsman.show();
        basketBallSportsman.study();
        BasketBallCoach basketBallCoach = new BasketBallCoach("赵六", 33);
        basketBallCoach.show();
        basketBallCoach.teacher();
    }
}
