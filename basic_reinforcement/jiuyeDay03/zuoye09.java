package jiuyeDay03;

import java.util.ArrayList;
import java.util.Collections;

//九、ArrayList集合中有如下内容： {33,11,77,55}，
// 使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果。
public class zuoye09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        Collections.sort(list);
        System.out.println(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
