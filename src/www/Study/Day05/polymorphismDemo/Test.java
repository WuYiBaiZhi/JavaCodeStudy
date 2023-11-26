package www.Study.Day05.polymorphismDemo;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.name);
        animal.show();
        if (animal instanceof Dog dog) {
            System.out.println(dog.name);
        } else if (animal instanceof Cat cat) {
            System.out.println(cat.name);
        }

    }
    public static class Animal {
        String name = "动物";

        public void show() {
            System.out.println("Animal ---- show方法");
        }
    }
    public static class Dog extends Animal {
        String name = "狗";

        @Override
        public void show() {
            System.out.println("Dog ---- show方法");
        }
    }
    public static class Cat extends Animal {
        String name = "猫";

        @Override
        public void show() {
            System.out.println("Cat ---- show方法");
        }
    }
}
