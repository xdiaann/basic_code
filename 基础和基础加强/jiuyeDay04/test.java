package 基础和基础加强.jiuyeDay04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        show01();
//         show02();
    }

    private static void show01() {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("黄晓明", "安吉拉卑鄙");
        map1.put("贾乃亮", "李小璐");
        map1.put("李晨", "范冰冰");
        //获得键
        System.out.println(map1.keySet());
        //获得值
        System.out.println(map1.values());
        System.out.println("========");
        Set<String> strings = map1.keySet();
        //遍历键
        for (String s : strings) {
            System.out.print(s + " ");
            //get（key）返回的是值
            System.out.print(map1.get(s) + " ");
        }
        System.out.println();
        System.out.println("========");
        //遍历值
        Collection<String> values = map1.values();
        for (String value : values) {
            System.out.print(value);
        }
    }

    private static void show02() {
        Map<String, String> map = new HashMap<>();
        map.put("黄晓明", "安吉拉卑鄙");
        map.put("贾乃亮", "李小璐");
        map.put("李晨", "范冰冰");
        //用entryset的方法遍历键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}





