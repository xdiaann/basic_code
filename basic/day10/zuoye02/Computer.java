package day10.zuoye02;

public class Computer {
    public void star(){
        System.out.println("开机");
    }
    public void shutdown(){
        System.out.println("关机");
    }
    public void usebUSB(USB usb){
     usb.open();
     usb.close();
    }
}
