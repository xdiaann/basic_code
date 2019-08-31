package day08;

//import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;

public class TEST {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
