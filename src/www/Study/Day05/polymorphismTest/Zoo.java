package www.Study.Day05.polymorphismTest;

public class Zoo {
    public static void main(String[] args) {
        Person person1 =new Person("老王",30);
        Person person2 =new Person("老李",25);
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setColor("黑颜色");
        Cat cat = new Cat();
        cat.setAge(3);
        cat.setColor("灰颜色");
        System.out.printf("年龄为%d的%s养了一只%s的%d岁的狗\n",person1.getAge(),person1.getName(),dog.getColor(),dog.getAge());
        person1.keepPet(dog,"骨头");
        System.out.printf("年龄为%d的%s养了一只%s的%d岁的猫\n",person2.getAge(),person2.getName(),cat.getColor(),cat.getAge());
        person1.keepPet(cat,"🐟");
    }
}
