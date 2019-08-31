package jiuyeDay06;

public class Thread1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        System.out.println(myThread.getName());
//        System.out.println(Thread.currentThread().getName());
        myThread.run();
    }
}
