package jiuyeDay09;

import java.io.FileWriter;
import java.util.Scanner;

public class zuoye07 {
    public static void main(String[] args) throws Exception {
        //项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输
        // 入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
        //1. 指定输出流， 对应的文件Info.txt
        FileWriter bw = new FileWriter("e:\\Info.txt");
        //2.采用循环的方式，把每条信息存储一行到Info.txt中
        Scanner sc = new Scanner(System.in);
        while (true) {
            //获取键盘输入的一行内容
            System.out.print("请输入内容：");
            String str = sc.nextLine();
            //当用户输入：”886”时，程序结束。
            if ("886".equals(str)) {
                System.out.println("输入结束");
                break;//跳出循环
            }
            //把内容写入到Info.txt文件中*
            bw.write(str);
            //换行
            bw.write(System.lineSeparator());
        }
        //关闭流
        bw.close();
    }
}

