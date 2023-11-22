package www.Study.Day02;

import java.util.StringJoiner;

public class StringJoinerStudy {
    public static void main(String[] args) {
//        StringJoiner stringJoiner = new StringJoiner("间隔符号"); // 创建一个对象指定拼接的间隔符号
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]"); // 创建一个对象指定拼接的间隔符号,开始符号,结束符号
        String[] strings = {"a", "b", "c", "d"};
        for (String string : strings) stringJoiner.add(string);
        System.out.println(stringJoiner.toString());
    }
}
