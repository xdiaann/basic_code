package jiuyeDay10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyOutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //新建一个文件，默认是GBK 以GBK的  以utf-8的格式写到一个新的文件中
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\a.txt"),"GBK");
        isr.read();
    }
}
