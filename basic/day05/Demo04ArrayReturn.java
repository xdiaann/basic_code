package day05;

// 用方法数组求 10 20 30 的和与平均数
public class Demo04ArrayReturn {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3)[0]);
        System.out.println(calculate(1, 2, 3)[1]);
        //或者可以这样写
        int[] result=calculate(2,3,4);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        return array;
    }
}
