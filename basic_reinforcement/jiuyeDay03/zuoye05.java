package jiuyeDay03;

import java.util.LinkedList;

//五、根据要求练习LinkedList方法：
//（1）基本方法：add, set, get, remove, clear, size等方法；
//（2）特有方法：addFirst, addLast, getFirst, getLast,
// removeFirst, removeLast, push, pop, clear等方法。
public class zuoye05 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.set(2,"1");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        list.addFirst("qwe");
        System.out.println(list);
        list.add("1");
        System.out.println(list);
        list.addLast("d");
        System.out.println(list);
        System.out.println(list.getLast());
    }
}
