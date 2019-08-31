package jiuyeDay07.吃包子;

public class TestChiBaoZi {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();


    }
}
