package day07;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("b");
        System.out.println(al.get(al.size()-1));

        System.out.println(al.get(0));
    }
}
