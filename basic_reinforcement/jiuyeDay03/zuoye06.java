package jiuyeDay03;

import java.util.HashSet;
//六、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。
public class zuoye06 {
    public static void main(String[] args) {
        HashSet<Person> hs=new HashSet<>();
        hs.add(new Person("王昭君", 21));
        hs.add(new Person("西施", 21));
        hs.add(new Person("杨玉环", 20));
        hs.add(new Person("貂蝉", 19));
        hs.add(new Person("杨玉环", 20));
        hs.add(new Person("貂蝉", 19));
        System.out.println(hs);
        for (Person h : hs) {
            System.out.println(h);
        }

    }


}
