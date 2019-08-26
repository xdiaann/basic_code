package 基础和基础加强.jiuyeDay12;

import java.util.function.Consumer;

public class MyConsumer3 {
    public static void main(String[] args) {
        String[] array={"迪丽热巴，女","古力娜扎，女","马儿扎哈，男"};
        method(array,(t)->{
            System.out.println("姓名:"+t.substring(0,4));
        },(t)->{
            System.out.println("性别:"+t.substring(5));
        });
    }

    public static void method(String[] array, Consumer<String> c1,Consumer<String> c2){
        for (String s : array){
            c1.andThen(c2).accept(s);
        }
    }
}
