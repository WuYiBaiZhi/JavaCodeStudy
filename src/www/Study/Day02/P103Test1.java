package www.Study.Day02;

import java.util.Scanner;

public class P103Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();
        char[] c = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '拾'};
        String string = "";
        while (Num != 0) {
            int ge = Num % 10;
            string = c[ge] + string;
            Num = Num / 10;
        }
        System.out.println(string);
    }
}
