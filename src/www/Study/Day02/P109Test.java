package www.Study.Day02;

public class P109Test {
    // 反转字符串
    public static void main(String[] args) {
        System.out.println(rotate("12345"));
        System.out.println(rotateToListToStr("12345"));
    }

    // 使用字符串截取实现
    public static String rotate(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int length = string.length() - 1; length >= 0; length--)
            stringBuilder.append(string.charAt(length));
        string = stringBuilder.substring(string.length());
        return string;
    }

    // 使用列表实现
    public static String rotateToListToStr(String string) {
        char[] chars = new char[string.length()];
        String newString = "";
        for (int length = string.length() - 1; length >= 0; length--) {
            newString += string.charAt(length);
        }
        return newString;
    }
}
