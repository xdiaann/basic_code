package 基础和基础加强.jiuyeDay12;

public class RunnableLambda {
    //定义一个方法stratThread ，方法的参数使用函数式接口Runnable
    public static void stratThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        stratThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--->"+"执行了");
            }
        });

        stratThread(()->{
            System.out.println(Thread.currentThread().getName()+"--->"+"执行了");
        });

        stratThread(()->System.out.println(Thread.currentThread().getName()+"--->"+"执行了"));

    }
}
