package jiuyeDay04;

import java.util.HashMap;
import java.util.Set;

public class test02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        map.put("qwe", 1);
        map.put("ewq", 2);



        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+":"+map.get(key));
        }
    }
}
