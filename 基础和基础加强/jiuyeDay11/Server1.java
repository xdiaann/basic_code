package 基础和基础加强.jiuyeDay11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        //创建服务器端口
        ServerSocket ss=new ServerSocket(6666);
        //开始监听客户端
        Socket accept = ss.accept();
        //获取接受的字节数据
        InputStream is = accept.getInputStream();
        //循环读取字节
        /*int by;
        while ((by=is.read())!=-1){
            System.out.print((char) by);
        }*/
        //循环读取字符串
        /*byte[] bys=new byte[1024];
        int len;
        while ((len=is.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }*/

        byte[] bys=new byte[1024];
        int len;
        String str=null;
        while ((len=is.read(bys))!=-1){
            System.out.println(str=new String(bys,0,len));
        }
        //输出给客户端
        OutputStream os = accept.getOutputStream();
        os.write(str.toUpperCase().getBytes());
        //关闭服务器和流
        ss.close();
        is.close();
        accept.close();
    }
}
