package day09.DemoFaHongBao;

import java.util.ArrayList;
import java.util.Random;

public class QunChengYuan extends YongHu {
    public QunChengYuan() {

    }

    public QunChengYuan(String name, int money) {
        super(name, money);
    }
    public void shouRed(ArrayList<Integer> redList) {
        //随机抽取一个红包
        int index=new Random().nextInt(redList.size());
        //随机移除的序列号
        int detal=redList.remove(index);

        int money=super.getMoney();

        super.setMoney(money+detal);



    }

}
