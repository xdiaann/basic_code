package 基础和基础加强.jiuyeDay03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//十、已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
// String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
//将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
// 将list中所有元素分别用迭代器和增强for循环打印出来。
public class zuoye10 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> qqList = new LinkedList<>();
        /*for (String str : strs) {
            if (!qqList.contains(str))
            qqList.add(str);
        }*/
        for (int i = 0; i < strs.length; i++) {
            if (qqList.contains(strs[i]))
                qqList.add(strs[i]);
        }

        System.out.println(qqList);
        for (String s : qqList) {
            System.out.println(s);
        }
        Iterator<String> iterator = qqList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
