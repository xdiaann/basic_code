package jiuyeDay08;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        File f = new File("c:\\IDEAproject\\basic_code");
        System.out.println(f);
        System.out.println("================");
        //public String[] list(); 返回一个[String 数组] 获取所有的子文件或目录 隐藏文件也能获取到
        String[] arr = f.list();
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("================");

        //public File[] listFiles(); 返回一个[File对象数组]获取所有的子文件或目录【路径】 隐藏文件也能获取到
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
