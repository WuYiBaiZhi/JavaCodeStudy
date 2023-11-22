package www.Study.Day02;

public class StringBuilderStudy {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("任意类型").append("都可以");
//        stringBuilder.reverse(); // 反转字符串
        stringBuilder.length(); // 返回长度
//        stringBuilder.toString(); // 转换为String 类型
        System.out.println(stringBuilder);
    }
}
