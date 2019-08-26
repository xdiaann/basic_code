package 基础和基础加强.jiuyeDay07;

public class BaoZiPu extends Thread {
    private final BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        //让包子铺生产包子
        //同步  保证只有一个线程在执行
        while (true) {
            synchronized (bz) {
                //对包子的状态判断
                if (bz.flag == true) {
                    //进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后开始生产包子
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三仙馅";
                } else {
                    bz.pi = "厚皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生产" + bz.pi + bz.xian + "的包子");
                //设置一个生产包子的时间
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子生产好了" + bz.pi + bz.xian + "包子吃货可以开吃了");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
