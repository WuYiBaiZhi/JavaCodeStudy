package www.Study.Day05.polymorphismTest;

public class Cat extends Animal{
    @Override
    public void eat(String something) {
        System.out.printf("%d岁的%s的猫咪眯着眼睛侧着头吃%s\n",getAge(),getColor(),something);
    }
    public void catchMouse() {
        System.out.println("喵咪在抓老鼠");
    }
}
