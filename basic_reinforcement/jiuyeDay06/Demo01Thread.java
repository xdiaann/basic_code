package jiuyeDay06;

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread01 mt = new MyThread01();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("mian" + i);

        }

    }
}

