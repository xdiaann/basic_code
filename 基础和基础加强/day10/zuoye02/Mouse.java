package 基础和基础加强.day10.zuoye02;

public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标的USB");
    }
}
