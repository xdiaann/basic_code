package day04;

public class 乘法表99 {

    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a + "*" + b + "=" + (a * b) + " ");
            }
            System.out.println();
        }
    }
}
