package 基础和基础加强.jiuyeDay04;

import java.util.HashMap;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("qwe", 1);
        map.put("ewq", 2);

        Set<String> keySet = map.keySet();//获取map中的key
        for (String key : keySet) {
            System.out.println(key+":"+map.get(key));
        }
    }
}
