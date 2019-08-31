package jiuyeDay10;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
//        test();
//        test2();
//字符缓冲流特殊功能
        //readline

    }

    private static void test2() throws IOException {
        //要求用字符缓冲流复制图片
        FileReader fr = new FileReader("e:\\a.txt");
        FileWriter fw = new FileWriter("f:\\a.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        int by;
        while ((by=br.read())!=-1){
           bw.write(by);
        }
        br.close();
        bw.close();
    }

    private static void test() throws IOException {
        //要求用字节缓冲流复制图片
        //        FileInputStream fis = new FileInputStream("E:\\美女.jpg");
//        FileOutputStream fos = new FileOutputStream("F:\\美女.jpg");

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\美女.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\美女.jpg"));
        int num;
        while ((num=bis.read())!=-1){
            bos.write(num);
        }
        bis.close();
        bos.close();
    }
}
