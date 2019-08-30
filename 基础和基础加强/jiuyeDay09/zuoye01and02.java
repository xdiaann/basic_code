package 基础和基础加强.jiuyeDay09;

import java.io.FileOutputStream;
import java.io.IOException;

public class zuoye01and02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("e:\\b.txt");
        fos.write(97);
        System.lineSeparator().getBytes();
        byte[] bytes = {73, 76, 79, 86, 69, 74, 65, 86, 65};
        fos.write(bytes);
        fos.close();
    }
}
