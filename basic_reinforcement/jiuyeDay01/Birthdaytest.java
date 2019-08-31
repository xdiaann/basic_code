package jiuyeDay01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Birthdaytest {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入生日：格式为XXXX-XX-XX");
        Scanner scanner = new Scanner(System.in);
        String birthDaySring=scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDayDate = sdf.parse(birthDaySring);
        long birthDayDateTime = birthDayDate.getTime();
        System.out.println(birthDayDateTime );

    }
}
