package www.Study.Day01;


import java.util.Scanner;

public class PhoneStringXXX {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个电话号码:");
        // 为变量phoneNum 录入手机号
        String phoneNum = scanner.next();
        // 为变量phoneList 用来存放phoneNum 转成的字符组
        char[] phoneList = new char[11];
        // 判断字符串长度查看是否合规
        if (phoneNum.length() == 11) {
            for (int i = 0; i < phoneNum.length(); i++) {
                // 遍历后插入列表中
                char c = phoneNum.charAt(i);
                if (i >= 3 && i <= 7) {
                    phoneList[i] = '*';
                } else phoneList[i] = c;
            }
        }
        // 使用字符串凭借转换we
        System.out.println(addString(phoneList));
    }
    // 把字符串中的字符拼接字符串
    public static String addString(char[] chars) {
        String string = "";
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            string = string + c;
        }
        return string;
    }
}
