package 基础和基础加强.jiuyeDay03;

import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        set.add(new Person("zhangsan",18));
        set.add(new Person("lisi",19));
        set.add(new Person("laowang",20));
        set.add(new Person("laowang",20));
        System.out.println(set);

    }
}
