package day09.DemoFaHongBao;

public class YongHu {
    private  String name;
    private int money;

    public YongHu() {
    }

    public YongHu(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void show(){
        System.out.println("我叫"+name+"，我有多少钱:"+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
