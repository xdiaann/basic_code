package day04;

public class Demo05qiuhe {
    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(getSum01(55));
    }

    public static int getSum() {
        int sum = 0;
        for (int a = 0; a <= 100; a++) {
            sum += a;
        }
        return sum;
    }

    public static int getSum01(int b) {
        int sum = 0;
        for (int a = 0; a <= b; a++) {
            sum += a;
        }
        return sum;
    }
}
