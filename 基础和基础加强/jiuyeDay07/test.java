package 基础和基础加强.jiuyeDay07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(3);
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---->" + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        exe.submit(r);
        exe.submit(r);
        exe.submit(r);
        exe.submit(r);
        exe.submit(r);
        exe.shutdown();//3个线程池 会先输出000-999 然后00-99
    }
}
