package www.Study.Day07.interfacetStudy;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子再吃胡萝卜");
    }
}
