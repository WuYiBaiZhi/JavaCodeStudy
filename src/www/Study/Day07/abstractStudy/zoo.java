package www.Study.Day07.abstractStudy;

public class zoo {
    public static void main(String[] args) {
        Frog frog = new Frog("小绿", 1);
        System.out.println(frog.getName() + ", " + frog.getAge());
        frog.eat();
        frog.drink();
    }
}
