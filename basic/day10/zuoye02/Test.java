package day10.zuoye02;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.star();
        Keyboard keyboard=new Keyboard();
        keyboard.open();
        keyboard.close();
        Mouse mouse = new Mouse();
        mouse.open();
        mouse.close();
        computer.shutdown();
        System.out.println("============");
        computer.star();
        computer.usebUSB(new Mouse());
        computer.usebUSB(new Keyboard());
        computer.shutdown();
    }
}
