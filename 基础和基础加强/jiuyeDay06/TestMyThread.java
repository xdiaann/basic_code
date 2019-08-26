package 基础和基础加强.jiuyeDay06;

import 基础和基础加强.jiuyeDay06.MyThread;

public class TestMyThread {
    public static void main(String[] args) {
//        MyRunnable mr=new MyRunnable();
//        Thread thread=new Thread(mr);
//        thread.setName("老王");
//        thread.run();
//        thread.start();
        //  两种设置线程名字的方法
        //第一种
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();
        //第二种  须在MyThread中创建有参构造
        new MyThread("旺财").start();


    }

            }
