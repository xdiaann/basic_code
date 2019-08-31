package day07;

import java.util.Random;
import java.util.Scanner;

public class Randomgame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();
            if (guessNum == 8848) {
                System.out.println("作弊启动，正确数字是：" + randomNum);
            } else if (guessNum > randomNum) {
                System.out.println("猜大咯，再来一次");
            } else if (guessNum < randomNum) {
                System.out.println("猜小咯，再来一次");
            } else {
                System.out.println("猜对咯，GameOver！");
                break;
            }
        }
    }
}
