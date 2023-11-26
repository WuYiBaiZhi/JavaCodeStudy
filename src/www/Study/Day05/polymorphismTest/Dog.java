package www.Study.Day05.polymorphismTest;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.printf("%d岁的%s的狗正在死死的抱住%s猛吃\n",getAge(),getColor(),something);
    }
    public void lookHome() {
        System.out.println("小狗在看家");
    }
}
