package jiuyeDay10;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\out.txt"));
        osw.write("basic/day05");
        osw.close();
    }
}
