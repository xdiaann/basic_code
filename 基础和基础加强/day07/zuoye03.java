package 基础和基础加强.day07;

import java.util.ArrayList;
import java.util.Scanner;

//分析以下需求并实现
//	1.创建一个ArrayList集合，用于存储一些字符串
//	2.通过键盘录入5个字符串，保存到集合中
//	3.遍历集合，打印每一个字符串
//
public class zuoye03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
           String str =sc.next();
           list.add(str);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+", " );

        }
    }
}
