package 基础和基础加强.jiuyeDay02;

import java.util.ArrayList;

public class DemoForeach {
    public static void main(String[] args) {
        Demo();
        System.out.println();
        Demo01();
    }

    private static void Demo01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String s : list) {
            System.out.print(s + " ");
        }

    }

    private static void Demo() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
