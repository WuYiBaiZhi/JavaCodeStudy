package www.Study.Day03;

import java.util.StringJoiner;

// 编写一个定义数组工具类
// 提供一个工具类方法printArr,用来返回数组的内容
//      只考虑整数数组,且只考虑一维数组.格式为[10,20,30,40,50,100]
// 提供一个工具方法getAerage,用于返回平均分
//      只考虑浮点数组,且只考虑一维数组
// 定义一个测试类TestDemo 测试该工具类的方法并返回结果
public class StaticArrayUtil {
    private StaticArrayUtil() {
    }

    public static String printArr(int[] list) {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int j : list) stringJoiner.add(String.valueOf(j));
        return stringJoiner.toString();
    }

    public static float getAverage(float[] list) {
        float sum = 0;
        for (float i : list) sum += i;
        return sum / list.length;
    }
}
