package 基础和基础加强.day10.zuoye02;

public class Keyboard implements USB{


    @Override
    public void open() {
        System.out.println("连接键盘的USB");
    }

    @Override
    public void close() {
        System.out.println("断开键盘的USB");
    }
}
