package jiuyeDay01;

import java.util.Arrays;

public class DemoSystem {
    public static void main(String[] args) {
        method01();
        method02();

    }

    private static void method02() {
        /*练习:
        将src数组中前3个元素，复制到dest数组的前3个位置上
        复制元素前：
        src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
        复制元素后：
        src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]*/
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        System.out.println(Arrays.toString(b));
        System.arraycopy(a,0,b,0,3);
        System.out.println(Arrays.toString(b));

    }

    private static void method01() {
        //public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
        //        用来验证程序的效率
        //验证for循环打印数字1-9999所需要使用的时间（毫秒）

        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
}
