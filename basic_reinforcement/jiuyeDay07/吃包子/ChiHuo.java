package jiuyeDay07.吃包子;

public class ChiHuo extends Thread {
    private  final BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //吃包子
        while (true){
            synchronized (bz){
                //先判断有没有包子
                if (bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"味的包子");
                try {
                    bz.wait(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("吃货已经把"+bz.pi+bz.xian+"味的包子吃完了");
                try {
                    bz.wait(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag=false;
                bz.notify();
                System.out.println("-----------------");
            }
        }
    }
}
