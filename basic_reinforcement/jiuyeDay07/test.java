package jiuyeDay07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(3);
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        exe.submit(r);
        exe.submit(r);
        exe.submit(r);
        exe.submit(r);
        exe.submit(r);
        exe.shutdown();
    }
}
