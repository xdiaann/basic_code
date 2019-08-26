package 基础和基础加强.jiuyeDay01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthdayCount {
    public static void main(String[] args) throws ParseException {
        //获取生日
        System.out.println("输入生日：格式为xxxx-xx-xx");
        Scanner scanner = new Scanner(System.in);
        String birthDayString = scanner.next();
        //使用DateFormat类中的方法pares解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDayDate = sdf.parse(birthDayString);
        //把生日的Date格式转换为毫秒值
        long birthDayDateTime = birthDayDate.getTime();
        //把当前时间转换成毫秒值
        long nowTime=new Date().getTime();
        System.out.println("你一共活了"+(nowTime-birthDayDateTime)/1000/60/60/24+"天");


    }
}
