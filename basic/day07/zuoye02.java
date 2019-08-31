package day07;

import java.util.Random;
import java.util.Scanner;
//分析以下需求并实现
//	1.通过键盘录入一个数字，作为数组的长度
//	2.根据录入的数字，创建一个长度为该数字的数组
//	3.通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
//	4.求出数组中最大数字
//	5.求出数组中的数字平均值
public class zuoye02 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("输入数组的长度：");
        int[] array=new int[sc.nextInt()];
        System.out.println("数组的长度为："+array.length);
        Random rd=new Random();
        int max=0;
        int he=0;

        for (int i = 0; i < array.length; i++) {
           array[i]= rd.nextInt(100)+1;
           if(array[i]>max){
               max=array[i];
           }
            he+=array[i];
        }
        System.out.println("最大值为"+max);
        System.out.println("平均值为"+(he/array.length));
    }
}
