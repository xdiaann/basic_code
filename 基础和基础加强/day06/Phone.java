package 基础和基础加强.day06;

public class Phone {
    private String barnd;
    private int price;

    public Phone() {
    }

    public Phone(String barnd, int price) {
        this.barnd = barnd;
        this.price = price;
    }

    public String getBarnd() {
        return barnd;
    }

    public void setBarnd(String barnd) {
        this.barnd = barnd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
}
