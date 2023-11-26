package www.Study.Day05.polymorphismTest;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(Animal animal, String something) {
        animal.eat(something);
        if (animal instanceof Dog dog) {
            dog.lookHome();
        } else if (animal instanceof Cat cat) {
            cat.catchMouse();
        }
    }
}
