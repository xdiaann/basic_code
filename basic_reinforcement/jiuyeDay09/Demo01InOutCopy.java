package jiuyeDay09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01InOutCopy {
    public static void main(String[] args) throws IOException {
        //要求： 复制一个文件
        method();
        //更快的方式
    }

    private static void method() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\b.txt");
        FileOutputStream fos=new FileOutputStream("F:\\b.txt");
        int by;
        //一个一个读，一个一个写  由于此方式是字节，所以可以复制任何类型
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
