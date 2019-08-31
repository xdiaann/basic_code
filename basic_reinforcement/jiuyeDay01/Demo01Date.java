package jiuyeDay01;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//当前系统时间Wed Oct 10 10:20:58 CST 2018
//        System.out.println(new DateFormat());//@3f2a3a5
//        System.out.println(new SimpleDateFormat());//@ca92313f
        System.out.println(new Date(0L));//Thu Jan 01 08:00:00 CST 1970  时间原点
        System.out.println(new Date(100000L));//TThu Jan 01 08:01:40 CST 1970 即距离时间原点1分40秒后的时间
        System.out.println(System.currentTimeMillis());//获取当前系统毫秒值  1539138746267
        System.out.println(new Date(1539138746267L));// 把当前系统毫秒值输入就得到当前日期Wed Oct 10 10:32:26 CST 2018
        System.out.println(date.getTime());//1539138746267获取当前系统毫秒值 相当于currentTimeMillis()
        date.setTime(100000L);//设置当前系统时间距时间原点多少毫秒
        System.out.println(date);//Thu Jan 01 08:01:40 CST 1970
    }
}
