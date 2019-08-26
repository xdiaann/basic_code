package 基础和基础加强.jiuyeDay05;

public class Thread3 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String a="黑马程序员"+i;
        }
        long end = System.currentTimeMillis();
        System.out.println("线程3执行时间"+(end-start));
    }
}
