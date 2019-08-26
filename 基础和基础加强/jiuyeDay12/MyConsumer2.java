package 基础和基础加强.jiuyeDay12;

import java.util.function.Consumer;

public class MyConsumer2 {
    public static void main(String[] args) {
        method((x)->System.out.println("姓:"+x.substring(0,2)),
               (x)->System.out.println("名:"+x.substring(2)));

    }
    public static void method(Consumer<String> con1,Consumer<String> con2){
        String str="慕容复";
        con1.accept(str);
        con2.accept(str);
        //or
        con1.andThen(con2).accept(str);
    }
}
