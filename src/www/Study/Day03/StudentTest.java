package www.Study.Day03;
// 静态变量测试
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        Student.teacherName = "阿玮老师";
//        s1.teacherName = "阿玮老师";

        s1.study();
        System.out.println(s1.show());

//        Student.teacherName = "潘老师";
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");

        s2.study();
        System.out.println(s2.show());
    }
}
