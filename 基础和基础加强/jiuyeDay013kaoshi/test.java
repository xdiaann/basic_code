package 基础和基础加强.jiuyeDay013kaoshi;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("java");
        list.add("java");
        list.add("javaja");
        list.add("bbb");
        System.out.println(list);//[aaa, java, java, javaja, bbb]
        //错误写法
        /*for (int i = 0; i < list.size(); i++) {
            if ("java".equals(list.get(i))){
                list.remove(i);
            }//[aaa, java, javaja, bbb]*/
        //删除java的元素
        /*for (int i = list.size() - 1; i >= 0; i--) {
            if ("java".equals(list.get(i))){
                list.remove(i);
            }
        }//[aaa, javaja, bbb]*/
        //删除所有含java的元素
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("java")) {
                list.remove(i);
            }
        }//[aaa, bbb]
        System.out.println(list);
    }
}

