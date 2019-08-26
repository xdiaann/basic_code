package 基础和基础加强.jiuyeDay08;

import java.io.File;
import java.util.Scanner;
//需求 键盘录入一个文件夹的路径，获取文件夹下的所有内容的名称 输入到控制台
public class Filetest {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹的路径");
        Scanner path=new Scanner(System.in);
        String i = path.next();
        File file = new File(i);
        //遍历文件夹 list返回的是字符串数组
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=========");
        //遍历文件夹 listFiles返回的是抽象路径名数组
        for (File s : file.listFiles()) {
            System.out.println(s);
        }
        //统计该文件下所有文件的大小
        int sum=0;
        for (File s : file.listFiles()) {
            if (s.isFile()){
                sum+=s.length();
            }
        }
        System.out.println(sum);
    }
}
