package 基础和基础加强.jiuyeDay05;

public class Threadoushu extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i%2==0){
                System.out.println("偶数"+i);
            }

        }
    }
}
