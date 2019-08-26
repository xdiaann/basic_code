package 基础和基础加强.day04;

import java.util.Scanner;

public class 通过三元运算判断是否是周末 {
    public static void main(String[] args) {



    }

    private static void method1() {
        //通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末
        Scanner sc = new Scanner(System.in);
        System.out.println("今天是周几？");
        int i = sc.nextInt();
//        if (i>0 &&i<=5){
//            System.out.println("今天是工作日");
//        }else if (i>5 &&i<=7){
//            System.out.println("今天是周末休息");
//        }else {
//            System.out.println("数据错误");
//        }
        if (i>7||i<1){
            System.out.println("数据错误");
        }else {
            System.out.println(i >= 6 ? "周末" : "工作日");
        }
    }
}
