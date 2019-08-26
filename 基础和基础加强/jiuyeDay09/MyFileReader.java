package 基础和基础加强.jiuyeDay09;

import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) throws IOException {
        /*FileReader 字符输入流
            FileReader（String path)
            FileReader(File file)
            int read() 一次读取一个字符数据
            int read(char[] chs)  一次读取一个字符数组的数据*/
        FileReader fr = new FileReader("e:\\b.txt");
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
