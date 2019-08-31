package jiuyeDay12;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorLambda {
    //定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };
    }

    public static void main(String[] args) {
        String[] arr={"aaa","b","cc","dddddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr, (o1, o2) -> o2.length()-o1.length());  直接调用

    }
}
