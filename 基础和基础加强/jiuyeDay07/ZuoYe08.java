package 基础和基础加强.jiuyeDay07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZuoYe08{
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(/*new Runnable() {
            @Override
            public void run*/() ->{
                System.out.println("我需要一个老师叫我学习java");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.currentThread().setName("小吴");
                System.out.println(Thread.currentThread().getName()+"教完后回到了教室");

        });
    }


}
