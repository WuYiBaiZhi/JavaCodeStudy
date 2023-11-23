package www.Study.Day03;
// 静态变量测试
public class Student {
    //属性: 姓名 年龄 性别
    private String name;
    private int age;
    private String gender;
    public  static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + "正在学习");
    }

    public String show() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
