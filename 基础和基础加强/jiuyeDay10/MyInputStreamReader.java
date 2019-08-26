package 基础和基础加强.jiuyeDay10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {
    public static void main(String[] args) throws IOException {
        //输入转换流    转换为相应的编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("e:\\GBK.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char) ch);
        }
        isr.close();
    }
}
