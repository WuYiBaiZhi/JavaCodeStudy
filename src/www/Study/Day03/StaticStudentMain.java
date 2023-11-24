package www.Study.Day03;

import java.util.ArrayList;

public class StaticStudentMain {
    public static void main(String[] args) {
        StaticStudentClass s1 = new StaticStudentClass("张三",21,"男");
        StaticStudentClass s2 = new StaticStudentClass("李四",19,"女");
        StaticStudentClass s3 = new StaticStudentClass("王五",20,"男");
        ArrayList<StaticStudentClass> StudentData = new ArrayList<>();
        StudentData.add(s1);
        StudentData.add(s2);
        StudentData.add(s3);

        System.out.println(StudentUtil.ArrayListAgeMax(StudentData));
    }
}
