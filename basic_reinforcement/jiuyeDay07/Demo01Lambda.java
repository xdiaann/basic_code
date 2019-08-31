package jiuyeDay07;

public class Demo01Lambda {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的方式");
            }
        };
        Runnable r = () -> System.out.println("lambda的方式");

        new Thread(r).start();
        new Thread(r1).start();
    }
}
