package jiuyeDay09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fuxi {
    public static void main(String[] args) throws IOException {
        /*项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以
        输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。*/
        FileWriter fw = new FileWriter("e://info.txt");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入内容：");
            String s = sc.nextLine();
            if ("886".equals(s)){
                System.out.println("录入结束");
                break;
            }
            fw.write(s);
            fw.write(System.lineSeparator());
        }
        fw.close();
    }
}
