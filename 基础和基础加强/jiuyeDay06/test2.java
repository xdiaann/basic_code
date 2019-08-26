package 基础和基础加强.jiuyeDay06;

public class test2 {
    public static void main(String[] args) {
        //用匿名内部类实现线程的方式一：
        new Thread("老狗") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + i);
                }
            }
        }.start();
        //用匿名内部类实现线程的方式二:
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        },"老毕").start();
    }
}

