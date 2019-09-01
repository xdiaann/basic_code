package day06.TestPhone;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.setBarnd("小米");
        phone.setPrice(998);
        System.out.println("正在使用价格为"+phone.getPrice()+"元的"+phone.getBarnd()+"品牌的手机打电话....");
        System.out.println("正在使用价格为"+phone.getPrice()+"元的"+phone.getBarnd()+"品牌的手机发短信....");
        System.out.println("正在使用价格为"+phone.getPrice()+"元的"+phone.getBarnd()+"品牌的手机玩游戏....");
        System.out.println("============");
        Phone phone1=new Phone("小米",998);
        System.out.println("正在使用价格为"+phone1.getPrice()+"元的"+phone1.getBarnd()+"品牌的手机打电话....");
        System.out.println("正在使用价格为"+phone1.getPrice()+"元的"+phone1.getBarnd()+"品牌的手机发短信....");
        System.out.println("正在使用价格为"+phone1.getPrice()+"元的"+phone1.getBarnd()+"品牌的手机玩游戏....");
        phone.call("lili");
        phone.sendMessage();
        phone.playGame();
    }
}
