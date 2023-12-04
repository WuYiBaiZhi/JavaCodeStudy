package www.Study.Day07.abstractStudy;

public class Test {
    public static void main(String[] args) {
//        Person p = new Person() {};
        Student student = new Student("张三" , 28);
        System.out.println(student.getName() + ", " + student.getAge());
    }
}
