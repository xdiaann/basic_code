package 基础和基础加强.jiuyeDay06;

import 基础和基础加强.jiuyeDay06.MyRunnable;

public class zuoye01 {
    public static void main(String[] args) {
        MyRunnable mr =new MyRunnable();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        t1.start();
        t2.start();

    }
}
