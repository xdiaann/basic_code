package 基础和基础加强.jiuyeDay05;

public class zuoye11 {
    public static void main(String[] args) {
        //创建三个子线程，在每个线程中开启10万次的循环，
        // 线程1循环中将循环自增变量i赋值给Integer类型变量 a，
        // 线程2循环中将字符串"黑马程序员"赋值给String类型变量b,
        // 线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
        //分别计算三个线程完成任务所用的毫秒值
        new Thread1().start();
        new Thread2().start();
        new Thread3().start();
    }
}

