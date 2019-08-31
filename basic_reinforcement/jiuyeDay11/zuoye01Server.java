package jiuyeDay11;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class zuoye01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        int len;
        byte[] bys=new byte[1024];
        while ((len=is.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
        ss.close();
        is.close();
        accept.close();
    }
}
