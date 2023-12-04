package www.Study.Day07.interfacetStudy;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("小绿", 1);
        System.out.println(frog.getName() + ", " + frog.getAge());
        frog.eat();
        frog.drink();
        frog.swim();
        Rabbit rabbit = new Rabbit("小白", 2);
        System.out.println(rabbit.getName() + ", " + rabbit.getAge());
        rabbit.eat();
    }
}
