package 测试题.diercimonikaoshi;

//1.定义一个抽象类Door（门），具有开open( )和close（）方法，无返回值，无参数
//    2.定义一个接口Lock（锁），具有上锁lockUp()和开锁openLock()方法，无返回值，无参数
//    3.定义一个接口DoorBell（门铃），具有拍照存档takePictrues()方法，无返回值，无参数
//    4.定义防盗门TheftoroofDoor类，具有普通门的开和关的功能，同时还有上锁、开锁、按门铃拍照存档的能力
//    5.创建测试类Test01,在main方法中测试以上功能，打印格式如下：
//	轻轻拉门，门关上了。
//        插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。
//        铃.......咔嚓.......拍照已存储
//        插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。
//        用力推，门打开了。
public class TheftoroofDoor extends Door implements Lock, DoorBell {

    @Override
    public void open() {
        System.out.println("用力推，门打开了");
    }

    @Override
    public void close() {
        System.out.println("轻轻拉门，门关上");
    }

    @Override
    public void takePictrues() {
        System.out.println("铃.......咔嚓.......拍照已存储");
    }

    @Override
    public void lockUp() {
        System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。");
    }

    @Override
    public void openLock() {
        System.out.println("插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。");
    }
}
