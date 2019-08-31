package jiuyeDay11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        //该方法只能接受一个客户端
        /*ServerSocket ss = new ServerSocket(8888);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        FileOutputStream fos = new FileOutputStream("F:\\a.jpg");
        int len;
        byte[] bys = new byte[1024];
        while ((len = is.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        is.close();
        fos.close();
        ss.close();*/
        //优化方法 多线程

        ServerSocket ss = new ServerSocket(8888);

        Socket accept = ss.accept();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream is = accept.getInputStream();
                    FileOutputStream fos = new FileOutputStream("F:\\a.jpg");
                    int len;
                    byte[] bys = new byte[1024];
                    while ((len = is.read(bys)) != -1) {
                        fos.write(bys, 0, len);
                    }
                    System.out.println("图片上传成功");
                    is.close();
                    fos.close();
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
