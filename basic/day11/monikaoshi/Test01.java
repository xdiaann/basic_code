package day11.monikaoshi;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        String arr[] = {"0af3s2sf", "s6ds1", "jjww", "lailai"};
        array(arr);
    }
    public static void array(String arr[]){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            String s =  arrayList.get(i);
            for (int j = 0; j <= 9; j++) {
                if (s.contains(j + "")) {
                    arrayList.remove(s);
                    i--;
                    break;
                }
            }
        }
        System.out.println(arrayList);
    }
}

