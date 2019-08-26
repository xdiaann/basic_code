package 基础和基础加强.day07;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    /*
定义以指定格式打印集合的方法（ArrayList类型作为参数)，使用{}括起集合，
使用@元素分隔每个元素。
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println("============");
        method(list);

    }
    public static void method(ArrayList<Integer> list1){
        System.out.print("{");
        for (int i = 0; i < list1.size(); i++) {
            if (i==list1.size()-1){
                System.out.print(list1.get(i)+"}");
            }else {
                System.out.print(list1.get(i)+"@");
            }
        }
    }
}






