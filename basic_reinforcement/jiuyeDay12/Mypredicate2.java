package jiuyeDay12;

import java.util.function.Predicate;

public class Mypredicate2 {
    public static void main(String[] args) {
        method(s -> s.split(",")[1].equals("男"),
                s -> Integer.parseInt(s.split(",")[2])>31);

    }
    public static void method(Predicate<String> t1,Predicate<String> t2){
        String str="马儿扎哈,男,32";
        if (t1.test(str)&&t2.test(str)){
            System.out.println(str);
        }
    }
}
