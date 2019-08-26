package 基础和基础加强.jiuyeDay11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BS_Server {
    public static void main(String[] args) throws IOException {
        //创建一个服务器对象，绑定一个端口
        ServerSocket ss = new ServerSocket(8889);
        //监听客户端请求（浏览器）
        while (true) {
            Socket accept = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //用输入流获取用户请求的数据
            //          InputStream is = accept.getInputStream();
            //          InputStreamReader isr = new InputStreamReader(is);
            //          BufferedReader br = new BufferedReader(isr);
                        //把以上3行合并位1行
                        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                        //GET / HTTP/1.1
                        String line = br.readLine();
                        line = line.split(" ")[1].substring(1);
                        System.out.println(line);
                        //往客户端返回数据
                        FileInputStream fis = new FileInputStream(line);
                        OutputStream os = accept.getOutputStream();
                        //返回暗号固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write(System.lineSeparator().getBytes());
                        //以下才是实际要发送给浏览器上展示的数据
//        os.write("helloworld".getBytes());
                        int len;
                        byte[] bys = new byte[1024 * 8];
                        while ((len = fis.read(bys)) != -1) {
                            os.write(bys, 0, len);
                        }
//        is.close();
//        isr.close();
                        fis.close();
//                        os.close();
//                        br.close();
                        accept.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
//            ss.close();

        }
    }
}
