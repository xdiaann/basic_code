package jiuyeDay06;

public class test3 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread("张三") {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("张三:工作完成，可以去休息了~~~~~~");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("张三:谁把我叫醒了！！");
                }
            }
        }.start();

        new Thread("李四") {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("李四:准备叫醒偷懒的哥们");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obj.notify();
                }
            }
        }.start();
    }
}
