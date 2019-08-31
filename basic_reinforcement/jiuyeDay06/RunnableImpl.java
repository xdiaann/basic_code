package jiuyeDay06;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            method();
        }
    }
            /*synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;*/

    public synchronized void method() {
        if (ticket > 0) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
