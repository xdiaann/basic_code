package day04;

public class 零到任意数求和 {
    public static void main(String[] args) {
        System.out.println(getSum());//0-100 5050
        System.out.println(getSum01(55));//1540
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
