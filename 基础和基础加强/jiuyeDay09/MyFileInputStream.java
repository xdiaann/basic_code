package 基础和基础加强.jiuyeDay09;

import java.io.FileInputStream;
import java.io.IOException;

public class MyFileInputStream {
    public static void main(String[] args) throws IOException {
        //FileInputStream
        //      int read()  读取单个字节数据并返回
        //      int read(byte[] b) 接收一个字节数组，读取字节数组长度那么多字节
        //      会将实际读取到的【长度】返回
        FileInputStream fis = new FileInputStream("e:\\a.txt");//abc
//        System.out.println((char)fis.read());//a
//        System.out.println((char)fis.read());//b
//        System.out.println((char)fis.read());//c
//        System.out.println(fis.read());//-1
//        int read = fis.read();
//        System.out.println(read);//a
//        System.out.println((char)fis.read());//b
//        read = fis.read();
//        System.out.println((char)read);//c
//        read = fis.read();
//        System.out.println(read);//-1
        //通过操作发现，如果read方法读取内容到了文件末尾，继续读取会返回-1
        //可以用循环的条件来优化代码
        /*int by;
        while ((by=fis.read())!=-1){
            System.out.print(by);//979899
        }
        fis.close();*/
    /*    while ((fis.read())!=-1){
            System.out.print(fis.read());//98-1
        }*/

        byte[] bytes = new byte[1024];
        int len;
        int sum = 0;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(len);//23
//            System.out.print(new String(bytes, 0, len));
//            sum+=len;
        }
        System.out.println(sum);
        fis.close();
    }
}
