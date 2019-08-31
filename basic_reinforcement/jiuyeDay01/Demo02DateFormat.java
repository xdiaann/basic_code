package jiuyeDay01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        System.out.println(date);
        //DateFormat方法  把Date日期格式化为指定格式的文本
        System.out.println(sdf.format(date)); //2018年10月10日 11时41分44秒
        //parse   把指定的格式转化为Date日期
        System.out.println(sdf.parse("2018年10月10日 15时01分41秒"));//Wed Oct 10 15:01:41 CST 2018


    }
}
