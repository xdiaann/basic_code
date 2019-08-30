package 基础和基础加强.day05;

public class demo01arrayfuzhi {
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
        System.out.println(array01[0]);
        //遍历动态数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
        for (int i : array01) {
            System.out.print(i+",");
        }
    }

}
