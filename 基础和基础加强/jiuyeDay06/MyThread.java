package 基础和基础加强.jiuyeDay06;

public class MyThread extends Thread {

    public MyThread() {
    }
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName()+" " +i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

