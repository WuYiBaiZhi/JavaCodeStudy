package www.Study.Day02;

public class P109Test {
    // 反转字符串
    public static void main(String[] args) {
        System.out.println(rotate("123"));
    }
    // 使用字符串截取实现
    public static String rotate(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.append(string.charAt(0));
        string = stringBuilder.substring(1);
        return  string;
    }
    public static String rotateToListToStr(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.append(string.charAt(0));
        string = stringBuilder.substring(1);
        return  string;
    }
}
