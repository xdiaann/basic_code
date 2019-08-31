package jiuyeDay11;

import jiuyeDay12.MessageBuilder;

public class Lambdayanchizhixing {
    /*public static void showLog(int level,String message){
        //定义一个根据日志级别显示日志信息的方法
        if (level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1="hello";
        String msg2="world";
        String msg3="java";
        showLog(2,msg1+msg2+msg3);

    }*/

    public static void showLog(int level, MessageBuilder mb){
        if (level==1){
            System.out.println(mb.Buildermessage());
        }
    }

    public static void main(String[] args) {
        String msg1="hello";
        String msg2="world";
        String msg3="java";
        //参数MessageBuilder是一个接口
        showLog(1, new MessageBuilder() {
            @Override
            public String Buildermessage() {
               return  msg1 + msg2 + msg3;
            }
        });
        //所以可以用一个Lambda表达式
        showLog(1,()->{
            return msg1+msg2+msg3;
        });
        //优化
        showLog(1,()->msg1+msg2+msg3);
    }
}
