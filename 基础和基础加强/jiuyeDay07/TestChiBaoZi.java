package 基础和基础加强.jiuyeDay07;

public class TestChiBaoZi {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();


    }
}
