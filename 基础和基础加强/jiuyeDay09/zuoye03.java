package 基础和基础加强.jiuyeDay09;

import java.io.FileWriter;
import java.io.IOException;

public class zuoye03 {
    public static void main(String[] args) throws IOException {
        //描述:在e盘下，有一c.txt 文件中内容为：HelloWorld 
        //在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
        //利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
        FileWriter fw = new FileWriter("E:\\c.txt",true);
        for (int i = 0; i < 5; i++) {
            fw.write("\r\ni love java");
        }
       fw.close();

    }
}
