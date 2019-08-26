package 基础和基础加强.day11.monikaoshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        String[] arr = {"0af3s2sf", "s6ds1", "jjww", "lailai"};
        array(arr);
    }
    private static void array(String[] arr){
        List<String> arrayList = new ArrayList<>(Arrays.asList(arr));

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

