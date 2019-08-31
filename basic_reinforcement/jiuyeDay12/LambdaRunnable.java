package jiuyeDay12;

public class LambdaRunnable {
//定义一个方法startThread,方法的参数使用函数式接口Runnable
    public static void StartThread(Runnable r){
        new Thread(r).start();
    }

    public static void main(String[] args) {
        StartThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"运行了");
            }
        });
        StartThread(()->System.out.println(Thread.currentThread().getName()+"运行了"));
    }

}
