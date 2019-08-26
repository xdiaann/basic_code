package 基础和基础加强.jiuyeDay09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class MyProperties {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("aa.txt"));
        Set<Object> keys = p.keySet();
        for (Object key : keys) {
            System.out.println(key + ":" + p.get(key));
//        method();
        }
    }
    private static void method () throws IOException{
            Properties p1 = new Properties();
            p1.put("01", "zhangsan");
            p1.put("02", "lisi");
            p1.put("03", "wangwu");
            p1.store(new FileWriter("aa.txt"), null);
    }
}


