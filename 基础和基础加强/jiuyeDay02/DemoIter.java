package 基础和基础加强.jiuyeDay02;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIter {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("diok");
        list.add("def");
        list.add("def");
        list.add("asdg");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
    }

