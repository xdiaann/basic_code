package jiuyeDay01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//String format(Date date)   按照指定的模式，把Date日期格式为符合模式的字符串
//Date parse (String source)  把符合模式的字符串解析为Date日期
public class DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }
        //解析为date格式
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2018年09月29日 23时15分09秒");
        System.out.println(date);
    }
        //转换为字符串（想要的格式）
    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
//        String d = sdf.format(date);
//        System.out.println(date);//Sat Sep 29 20:11:01 CST 2018
//        System.out.println(d);//2018年09月29日 20时11分01秒
        System.out.println(new Date());
        System.out.println(sdf.format(date));
    }
}
