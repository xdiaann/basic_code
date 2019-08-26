package 基础和基础加强.jiuyeDay05;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("mt"+i);
        }
    }
}
