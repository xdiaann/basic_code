package day07;

import java.util.Scanner;

public class Scannersumandmmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int sum = num + num1;
        System.out.println("和为" + sum);

        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        int max=a>b?(a>c?a:c):(c>b?c:b);
        System.out.println(max);
        }
}
