package day05;

import java.util.Arrays;

public class Demo01arrayfuzhi {
    public static void main(String[] args) {
        //动态
        int[] array = new int[5];
        System.out.println(array[0] = 1);
        System.out.println(array[1] = 2);
        System.out.println(array[2] = 3);
        System.out.println(array[3] = 4);
        System.out.println(array[4] = 5);
        System.out.println("==========");
        System.out.println(array[0] = 11);
        System.out.println(array[1] = 22);
        System.out.println(array[2] = 33);
        System.out.println(array[3] = 44);
        System.out.println(array[4] = 55);
        //静态
        int[] array01 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array01));//[1, 2, 3, 4, 5]
        //遍历动态数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");//11 22 33 44 55

        }
    }

}
