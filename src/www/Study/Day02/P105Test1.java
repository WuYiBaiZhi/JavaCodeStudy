package www.Study.Day02;

import java.util.Scanner;

public class P105Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.next());
        if (str.toString().contentEquals(str.reverse())) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }
    }
}
