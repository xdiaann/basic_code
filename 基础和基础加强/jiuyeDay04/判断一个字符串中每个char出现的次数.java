package 基础和基础加强.jiuyeDay04;

import java.util.HashMap;
import java.util.Map;

/*
    统计的数据有两个：
        字符：出现的次数
    步骤：
        定义一个HashMap集合，其中键是字符，值就是出现的次数

        遍历字符串，拿到每次字符。
            判断此字符是否已经统计过 boolean containsKey(Object key)
                1. 如果统计过，再将之前的统计次数+1，设置回去
                2. 如果没有统计过，设置此字符出现的次数为1*/
public class 判断一个字符串中每个char出现的次数 {
    public static void main(String[] args) {
        String str = "helloworldjavahehexixihaha";
        Map<Character, Integer> sIHsM = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            //遍历字符串，获取每个字符
            char ch = str.charAt(i);
            //判断这个字符是否已经被统计过
            if (sIHsM.containsKey(ch)) {
                //如果统计过，则将已经出现的次数取出+1，在设置回去
                sIHsM.put(ch, sIHsM.get(ch) +1);
            } else {
                //如果没有统计过，则设置此字符出现的次数为1
                sIHsM.put(ch, 1);
            }
        }
        System.out.println(sIHsM);
    }
}
