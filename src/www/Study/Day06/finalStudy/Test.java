package www.Study.Day06.finalStudy;

import www.Study.Day03.Student;

public class Test {
    public static void main(String[] args) {
        final String passWord = "123456";
//        passWord = "111";
        final Student student = new Student("张三", 17,"男");

        student.setName("李四");
        student.setAge(18);

        System.out.println(student.show());
        String s = "dad";
        System.out.println(s.hashCode());
    }
}
