
package 基础和基础加强.jiuyeDay10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class sortchushibiao {
    public static void main(String[] args) throws IOException {
        //要求   将打乱的出师表重新排序  写回原文件
//        test1();
        //        创建读取对象
        BufferedReader br = new BufferedReader(new FileReader("e:\\出师表.txt"));
        //
        String s;
        //创建hm集合
        HashMap<Integer, String> ishm = new HashMap<>();
        //遍历
        while ((s=br.readLine())!=null){
            //得到s字符串的第一个字符
            String substring = s.substring(0, 1);
            //把字符转换为int类型，因为集合的键是int类型
            int i = Integer.parseInt(substring);
            ishm.put(i,s);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\出师表.txt"));
        //循环10次，因为i就是代表了顺序
        for (int i =1; i < 10; i++) {
            String s1 = ishm.get(i);
            bw.write(s1);
            bw.newLine();
        }
        bw.close();

    }

    private static void test1() throws IOException {
        //1，读取乱序的文件内容到集合中
        BufferedReader br = new BufferedReader(new FileReader("e:\\出师表.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
//        System.out.println(list);
        //2,排序
//      Collections.sort(list, (String o1, String o2) -> Integer.parseInt(o1.substring(0, 1)) - Integer.parseInt(o2.substring(0, 1)));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.substring(0, 1)) - Integer.parseInt(o2.substring(0, 1));
            }
        });
//        System.out.println(list);
        //3写回原文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\出师表.txt"));
        for (String s : list) {
            System.out.println(s);
            bw.write(s + "\r\n");
        }
        bw.close();
    }
}

