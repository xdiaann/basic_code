package jiuyeDay11;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class zuoye01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",7777);
        OutputStream os = socket.getOutputStream();
        os.write("hello，服务器，我是客户端".getBytes());
//        socket.shutdownOutput();
        os.close();
        socket.close();
    }
}
