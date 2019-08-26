package 基础和基础加强.jiuyeDay05;

public class TestThread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.run();

        for (int i = 0; i < 100; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            System.out.println("main"+i);
        }
    }


}
