package 基础和基础加强.jiuyeDay10;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\out.txt"));
        osw.write("你好");
        osw.close();
    }
}
