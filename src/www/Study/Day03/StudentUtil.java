package www.Study.Day03;

import java.util.ArrayList;

public class StudentUtil {
    public static int ArrayListAgeMax(ArrayList<StaticStudentClass> StudentData) {
        int maxAge = 0;
        for (StaticStudentClass studentData : StudentData) {
            maxAge = Math.max(studentData.getAge(),maxAge);
        }
        return maxAge;
    }
}
