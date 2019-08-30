package 基础和基础加强.jiuyeDay06;

//一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
//	要求:请用多线程模拟卖票过程并打印剩余电影票的数量
public class MyRunnable implements Runnable {
    private int ticket = 1000;

    @Override
    public void run() {
        while (true) {
            method();
        }
    }

    public synchronized void method() {
        if (ticket > 0) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +
                    "正在卖第" + ticket + "张票,剩余" + (ticket - 1) + "张票");
            ticket--;
        }
    }

}


