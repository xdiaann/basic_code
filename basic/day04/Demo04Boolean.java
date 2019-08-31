package day04;

public class Demo04Boolean {
    public static void main(String[] args) {
        System.out.println(compare(1, 2));
        System.out.println(compare(2, 2));
        System.out.println(compare(2, 3));
    }

     private static boolean compare(int a, int b) {
        return a == b;
    }
}