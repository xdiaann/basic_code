package jiuyeDay08;

public class Recurison {
    public static void main(String[] args) {
        //#递归
        //次数也不能太多，否则也会溢出
        //构造方法，禁止递归 是创建对象使用的  会有无数多个对象，直接编译报错
        //该方法会无限循环，导致栈内存溢出  所以要有条件限定保证递归能够停止下来
//         a();

        //使用递归求1-n的和
//         System.out.println(sum(3));

        //使用递计算阶乘
//        System.out.println(sum2(5));
    }
    //求1-n的和
    private static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        //即5+sum（4） -》5+4+sum（3）-》5 +4+3+sum（2）-》5+4+3+2+sum（1）-》5+4+3+2+1
        return i + sum(i - 1);
    }
    //阶乘
    private static int sum2(int n) {
        if (n == 1) {
            return 1;
        }
        //即5*sum（4） -》5*4*sum（3）-》5*4*3*sum（2）-》5*4*3*2*sum（1）-》5*4*3*2*1
        return n * sum2(n - 1);
    }
    //递归死循环
    private static void a() {
        System.out.println("a方法");
        a();
    }
}
