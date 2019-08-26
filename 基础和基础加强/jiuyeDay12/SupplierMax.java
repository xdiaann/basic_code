package 基础和基础加强.jiuyeDay12;

import java.util.function.Supplier;

public class SupplierMax {
    public static void printMax(Supplier<Integer> sup){
        System.out.println("数组中元素最大值是："+sup.get());
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,32,322,-23,2312,-123123};
        //调用方法  把最大值赋值给方法参数sup
        printMax(()->{
            int max=arr[0];
            for (int i : arr) {
                if (i>max){
                    max=i;
                }
            }
            return max;
        });
    }
}
