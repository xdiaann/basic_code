package jiuyeDay11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket = new Socket("127.0.0.1", 6666);
        //向服务器写入字节数据
        OutputStream os = socket.getOutputStream();
        os.write("ssd上的c".getBytes());
        socket.shutdownOutput();
        //关闭客户端和流
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len;
        while ((len = is.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        os.close();
        is.close();
        socket.close();
    }
}