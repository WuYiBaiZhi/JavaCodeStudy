package www.Study.Day01;

public class StrReverser {
    public static void main(String[] args) {
        System.out.println(stringReverser("abc"));
    }
    public static String stringReverser(String string) {
        String stringReverser = "";
        for (int length = string.length(); length > 0; length--) {
            char c = string.charAt(length);
            System.out.println(c);
        }
        return "stringReverser";
    }
}
