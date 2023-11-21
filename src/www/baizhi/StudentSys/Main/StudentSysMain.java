package www.baizhi.StudentSys.Main;

import www.baizhi.StudentSys.Class.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSysMain {
    public static void main(String[] args) {
        ArrayList<Student> studentsData = new ArrayList<>();
        // 初始化3个学生
        studentsData.add(new Student("1", "张三", 18, "饭都花园"));
        studentsData.add(new Student("2", "张三", 8, "饭都大厦"));
        studentsData.add(new Student("3", "李四", 17, "翻斗花园"));
        Scanner scanner = new Scanner(System.in);
        toMainMenu();
        boolean flag = true;
        while (flag) {
            switch (scanner.next()) {
                case "1", "添加学生" -> {
                    System.out.println("请选择要输入几位学生:");
                    int index = scanner.nextInt();
                    for (int i = 0; i < index; i++) {
                        System.out.printf("第%d位:\n", i + 1);
                        Student addStudent = addStudent();
                        if (onlyOneIdCheck(addStudent.getId(),studentsData)) {
                            System.out.printf("ID:%s重复\n",addStudent.getId());
                        } else {
                            studentsData.add(addStudent);
                        }
                    }
                    toMainMenu();
                }
                case "2","删除学生" -> {
                    System.out.println("------------删除学生------------");
                    System.out.print("请输入要删除的id:");
                    String id = scanner.next();
                    if (queryIndexStudent(id, studentsData) < 0) {
                        System.out.println("没有这个童鞋");
                    } else {
                        System.out.println("要删除的是" + studentsData.get(queryIndexStudent(id, studentsData)).toString());
                        studentsData.remove(queryIndexStudent(id, studentsData));
                        System.out.println("删除成功!!!");
                    }
                    toMainMenu();
                }
                case "3","修改学生" -> {
                    System.out.println("------------修改学生------------");
                    System.out.print("请输入要修改的id:");
                    String id = scanner.next();
                    studentsData.set(queryIndexStudent(id,studentsData),setStudent(queryIndexStudent(id,studentsData),studentsData));
                    toMainMenu();
                }
                case "4", "查询学生" -> {
                    System.out.println("------------查询学生------------");
                    System.out.print("1.查询学生\n2.打印所有学生\n请输入要执行的选项:");
                    String choose = scanner.next();
                    if (choose.equals("1") || choose.equals("查询学生")) {
                        printStudent(queryStudent(studentsData));
                        System.out.println("查询完毕");
                    } else if (choose.equals("2") || choose.equals("打印所有学生")) {
                        printStudent(studentsData);
                    } else {
                        System.out.println("没有这个选择");
                    }
                    toMainMenu();
                }
                case "5", "退出", "exit" -> flag = false;
                default -> toMainMenu();
            }
        }
    }

    public static void toMainMenu() {
        System.out.println("------------欢迎来到某个学生管理系统------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
        System.out.print("请输入你的选择:");
    }

    public static Student addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入id:");
        String id = scanner.next();
        System.out.print("请输入姓名:");
        String name = scanner.next();
        System.out.print("请输入年龄:");
        int age = scanner.nextInt();
        System.out.print("请输入家庭地址:");
        String address = scanner.next();
        return new Student(id, name, age, address);
    }

    public static boolean onlyOneIdCheck(String id, ArrayList<Student> studentsData) {
        for (Student student : studentsData) {
            if (id.equals(student.getId()))
                return true;
        }
        return false;
    }

    public static int queryIndexStudent(String id, ArrayList<Student> studentsData) {
        for (int i = 0; i < studentsData.size(); i++) {
            if (id.equals(studentsData.get(i).getId()))
                return i;
        }
        return -1;
    }

    public static Student setStudent(int index,ArrayList<Student> studentsData) {
        Scanner scanner = new Scanner(System.in);
        Student student = studentsData.get(index);
        System.out.println("""
                1.修改id
                2.修改姓名
                3.修改年龄
                4.修改地址
                5.修改全部""");
        String flag = scanner.next();
        switch (flag) {
            case "1" -> {
                System.out.print("请输入学生ID:");
                student.setId(scanner.next());
            }
            case "2" -> {
                System.out.print("\n请输入学生姓名:");
                student.setName(scanner.next());
            }
            case "3" -> {
                System.out.print("\n请输入学生年龄:");
                student.setAge(scanner.nextInt());
            }
            case "4" -> {
                System.out.print("\n请输入学生地址:");
                student.setAddress(scanner.next());
            }
            case "5" -> {
                System.out.print("请输入学生ID:");
                student.setId(scanner.next());
                System.out.print("\n请输入学生姓名:");
                student.setName(scanner.next());
                System.out.print("\n请输入学生年龄:");
                student.setAge(scanner.nextInt());
                System.out.print("\n请输入学生地址:");
                student.setAddress(scanner.next());
            }
        }
        return student;

    }

    public static ArrayList<Student> queryStudent(ArrayList<Student> studentsData) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> queryStudent = new ArrayList<>();
        System.out.println("""
                ------------查询学生------------
                1.使用id查询(推荐)
                2.使用姓名查询
                2.使用年龄查询""");
        String choose = scanner.next();
        switch (choose) {
            case "1", "id" -> {
                System.out.print("请输入要查询的id:");
                String id = scanner.next();
                for (Student student : studentsData) {
                    if (student.getId().equals(id)) {
                        queryStudent.add(student);
                    }
                }
            }
            case "2", "姓名" -> {
                System.out.print("请输入要查询的姓名:");
                String name = scanner.next();
                for (Student student : studentsData) {
                    if (student.getName().equals(name)) {
                        queryStudent.add(student);
                    }
                }
            }
            case "3", "年龄" -> {
                System.out.print("请输入要查询的年龄:");
                int age = scanner.nextInt();
                for (Student student : studentsData) {
                    if (student.getAge() == age) {
                        queryStudent.add(student);
                    }
                }
            }
        }

        return queryStudent;
    }

    public static void printStudent(ArrayList<Student> studentsData) {
        for (Student student : studentsData) {
            System.out.println(student.toString());
        }
    }
}
