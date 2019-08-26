package 基础和基础加强.jiuyeDay05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryCatch {
    public static void main(String[] args) {
        String a="123";
        try {
            a.charAt(3);
        }catch (StringIndexOutOfBoundsException b){
            System.out.println("索引越界异常");
        }

        String b=null;
        try {
            b.charAt(0);
        }catch (NullPointerException c){
            System.out.println("空指针异常");
        }
        try {
            int c=2/0;
        }catch (ArithmeticException d){
            System.out.println("算术异常");
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

        try {
            Date date = format.parse("2018-04-03");
            System.out.println("程序正常");

        } catch (ParseException e) {
            System.out.println("程序异常");
        }
    }
}

