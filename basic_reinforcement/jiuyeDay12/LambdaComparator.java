package jiuyeDay12;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaComparator {
    //定义一个方法,方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator() {
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()- o2.length();
            }
        };*/
        //简化Lambda表达式
        return (String o1, String o2) ->o1.length() - o2.length();
    }

    public static void main(String[] args) {
        String[] str={"aaa","bbbb","ccccc","dd","e"};
        //排序前
        System.out.println(Arrays.toString(str));
        //排序 调用Arrays.sort   第一个参数传数组，第二个参数传接口的实现类·
        Arrays.sort(str,getComparator());
        //排序后
        System.out.println(Arrays.toString(str));
    }
}
