package 基础和基础加强.jiuyeDay03;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list=  new ArrayList<String>();
        list.add("动物王国");
        list.add("四大天王");
        list.add("月光宝盒");
        list.add("一出好戏");
        System.out.println(list);
        //在指定位置添加元素
        list.add(2,"无双");
        System.out.println(list);
        //获取指定位置的元素
        System.out.println(list.get(2));
        //将指定位置的元素删除，返回被删除的元素
        System.out.println(list.remove(2));
        System.out.println(list);
        //修改指定位置的元素，将被修改的元素返回
        System.out.println(list.set(2,"null"));
        System.out.println(list);

    }
}


