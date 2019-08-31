package day04;

import java.util.Scanner;

public class 判断是否是闰年 {
    public static void main(String[] args) {
        System.out.println("请输入年份:");
        Scanner s =new Scanner(System.in);
        while (true) {
            int year=s.nextInt();
            if (year == 0 || year == 886) {
                System.out.println("查询结束");
                break;
            }
            if((year%4==0&year%100!=0)||year%400==0) {
                System.out.println(year+"是闰年");}
            else {
                System.out.println(year+"不是闰年");}

        }
    }
}
