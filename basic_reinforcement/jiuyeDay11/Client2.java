package jiuyeDay11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\1.jpg");
        Socket client = new Socket("127.0.0.1", 8888);
        OutputStream os = client.getOutputStream();
        int len;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            os.write(bys, 0, len);
        }
        fis.close();
        client.close();
        os.close();
    }
}
