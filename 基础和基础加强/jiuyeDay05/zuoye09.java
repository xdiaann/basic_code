package 基础和基础加强.jiuyeDay05;

public class zuoye09 {
    public static void main(String[] args) {
        //创建多线程对象，开启多线程。在子线程
        // 中输出1-100之间的偶数，主线程输出1-100之间的奇数
        基础和基础加强.jiuyeDay05.Threadoushu threadoushu=new 基础和基础加强.jiuyeDay05.Threadoushu();
        threadoushu.start();
        for (int i = 1; i < 101; i++) {
            if (i%2==1){
                System.out.println("奇数"+i);
            }
        }
    }
}
