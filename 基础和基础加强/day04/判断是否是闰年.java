package 基础和基础加强.day04;

import java.util.Scanner;

public class 判断是否是闰年 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("请输入年份");
        int year=s.nextInt();
        if((year%4==0&year%100!=0)||year%400==0) {
            System.out.println(year+"这是闰年");}
        else {
            System.out.println(year+"这不是闰年");}
    }
}
