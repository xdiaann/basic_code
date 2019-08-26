package 基础和基础加强.jiuyeDay13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//Stream常用方法
// void forEach（Consumer c） 终结方法（生产线到了末尾，不能在操作了）
//Stream filter（Predicate p）延迟方法（在后面可以继续进行其他操作）
//Stream map（Function f） 延迟方法（在后面可以继续进行其他操作）
//long count（）  终结方法（生产线到了末尾，不能在操作了） 返回String中的元素个数
//Stream limit（n）  截取前N个
//Stream skip（n） 跳过前N个
public class StreamForEach {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("1");
        s2.add("2");
        s2.add("3");
        Stream<String> concat = Stream.concat(s1.stream(), s2.stream());
        concat.forEach(System.out::println);
    }

    private static void method3() {
        ArrayList<String> s = new ArrayList<>();
        s.add("张三");
        s.add("赵敏");
        s.add("张无忌");
        s.add("周芷若");
        s.add("张三丰");
        s.add("张翠花");
        //统计姓张人的个数
        System.out.println(s.stream().filter(s1 -> s1.startsWith("张")).count());
        //统计姓张，名师要求是三个字数的人的个数： long count（）；
        System.out.println(s.stream().filter(s1 -> s1.startsWith("张")).filter(s1 -> s1.length()==3).count());
    }

    private static void method2() {
        ArrayList<String> s = new ArrayList<>();
        s.add("hello");
        s.add("world");
        s.add("java");
        //需求 把首字母大写  map进行转换
        s.stream().map(s1 -> s1.substring(0,1).toUpperCase()+s1.substring(1)).forEach(System.out::println);
    }

    private static void method1() {
        ArrayList<String> s = new ArrayList<>();
        s.add("你好");
        s.add("s");
        s.add("f");
        s.add("l");
        s.add("ll");
//        s.forEach(s1 -> System.out.println(s1));
        int[] arr={1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        //过滤包含“l"的字符
        s.stream().filter(s1 -> !s1.contains("l")).forEach(System.out::println);
    }
}
