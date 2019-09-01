package day06.TestShouji;

public class Shouji {
    String yanse;
    int size;
    int jiage;

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void play() {
        System.out.println("玩游戏");
    }

    public void message(String name) {
        System.out.println("给" + name + "发短信");
    }
}
