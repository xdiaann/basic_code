package 基础和基础加强.jiuyeDay10;

import java.io.FileInputStream;
import java.io.IOException;

public class zuoye01 {
    public static void main(String[] args) throws IOException {
        //实现一个验证程序运行次数的小程序，要求如下：
        //	1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        //	2.程序运行演示如下:
        //		第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
        //		第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
        //		第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
        //		第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        FileInputStream fis = new FileInputStream("E:\\a.txt");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
    }
}
