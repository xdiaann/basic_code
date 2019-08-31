package day04;

public class 区分除和取模 {
    public static void main(String[] args) {
        System.out.println(sum(987, 10));

        System.out.println(2 / 5);//0
        System.out.println(4 / 5);//0
        System.out.println(6 / 5);//1
        System.out.println(8 / 5);//1
        System.out.println(11 / 5);// 2
        System.out.println(12 / 5);// 2
        System.out.println(13 / 5);// 2

        System.out.println(17 % 5);// 2
        System.out.println(16 % 5);// 1
        System.out.println(13 % 5);// 3
        System.out.println(8 % 5);//3
        System.out.println(7 % 5);//2

    }

    public static int sum(int a, int b) {
        return (a) % b;
    }
}
