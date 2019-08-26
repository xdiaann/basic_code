package 基础和基础加强.jiuyeDay12;

import java.util.function.Supplier;

public class MySupplier {
    //定义一个方法，方法的参数传递Supplier《t》接口，泛型String，get方法就放回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }
    public static void main(String[] args) {
        String s = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "胡歌";
            }
        });
        System.out.println(s);
        //优化
        System.out.println(getString(() -> "胡歌"));
    }
}
