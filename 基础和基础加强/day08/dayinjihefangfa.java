package 基础和基础加强.day08;

import java.util.ArrayList;
//打印集合方法  定义以制定格式打印集合的方法
// （ArrayList类型作为参数),使用{}括号括起来使用@分隔每个元素
public class dayinjihefangfa {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("殷梨亭");
        System.out.println(list);
        pirntArrayList(list);
    }

    private static void pirntArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.println(list.get(i)+"}");
            }else {
                System.out.print(list.get(i)+"@");
            }
        }
    }

}
