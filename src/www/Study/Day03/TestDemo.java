package www.Study.Day03;

// 测试类TestDemo
public class TestDemo {
    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40};
        System.out.println(StaticArrayUtil.printArr(list));
        float[] floatList = {10, 20, 30, 47};
        System.out.println(StaticArrayUtil.getAverage(floatList));
    }
}
