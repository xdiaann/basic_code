package 基础和基础加强.jiuyeDay08;

import java.io.File;

public class test {
    public static void main(String[] args) {
        //第三题：使用文件过滤器来打印出E盘下的所有.txt文件名称
        File file = new File("E:\\","e");
        System.out.println(file);
        getTxt(file);
    }

    private static void getTxt(File file) {

    }
}
