package 基础和基础加强.jiuyeDay08;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        File f = new File("E:\\IDEAproject\\basic-code");
        System.out.println(f);
        //public String[] list(); 返回一个[String 数组] 获取所有的子文件或目录 隐藏文件也能获取到
        String[] arr = f.list();
        //遍历该string数组
        for (String s : arr) {
            System.out.println(s);
        }
        //public File[] listFiles(); 返回一个[File对象数组]获取所有的【详细】的子文件或目录 隐藏文件也能获取到
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
            //E:\IDEAproject\basic-code
            //.idea
            //code
            //out
            //E:\IDEAproject\basic-code\.idea
            //E:\IDEAproject\basic-code\code
            //E:\IDEAproject\basic-code\out
        }
    }
}
