package 基础和基础加强.jiuyeDay12;

import java.util.function.Consumer;

public class MyConsumer {
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("赵丽颖",(String haha)->{
            System.out.println(haha);


        String reName= new StringBuffer(haha).reverse().toString();
        System.out.println(reName);
        });
    }
}
