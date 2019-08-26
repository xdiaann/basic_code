package 基础和基础加强.jiuyeDay03;

import java.util.Iterator;
import java.util.LinkedHashSet;

//八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。使用迭代器和增强for循环遍历LinkedHashSet。
public class zuoye08 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet();
        lhs.add("王昭君");
        lhs.add("王昭君");
        lhs.add("西施");
        lhs.add("杨玉环");
        lhs.add("貂蝉");
        System.out.println(lhs);
        for (Object lh : lhs) {
            System.out.println(lh);
        }
        Iterator iterator = lhs.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
