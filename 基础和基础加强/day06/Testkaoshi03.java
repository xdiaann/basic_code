package 基础和基础加强.day06;
//有一个int类型的数组arr,数组中元素为{15,26,98,56,77,42,30,14,45}。
//     1.遍历数组，要求用“[元素1,元素2,元素3,元素4,元素5,元素6]”的方式将数组打印在控制台。（不允许使用Arrays.toString()方法）
//     2.然后获取数组中元素的最大值，和最小值。打印格式为：“数组arr元素中最大值为：max”   “数组arr元素中最小值为：min”
//     3.找出数组中元素即是3的倍数又是5的倍数的元素，以(“数组中即是3的倍数又是5的倍数的元素有:”+arr[i])  的方式输出到控制台
public class Testkaoshi03 {
    public static void main(String[] args) {
        int[] arr = {15, 26, 98, 56, 77, 42, 30, 14, 45};
        int len = arr.length;
        int max = arr[0];
        int min = arr[0];
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i]+ ",");
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println();
        System.out.print("数组中即是3的倍数又是5的倍数的元素有:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("数组arr元素中最大值为：" + max);
        System.out.println("数组arr元素中最小值为：" + min);
    }
}
