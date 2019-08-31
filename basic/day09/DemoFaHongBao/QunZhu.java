package day09.DemoFaHongBao;

import java.util.ArrayList;

public class QunZhu extends YongHu {
    public QunZhu(){}

    public QunZhu(String name, int money) {
        super(name, money);
    }

    //发多少个红包  发红包的金额  因为有N个红包 所以返回值是一个集合
    public ArrayList<Integer> send(int sendmoney, int count) {
        //当前的金额
        int allMoney = super.getMoney();
        ArrayList<Integer> redList = new ArrayList<>();
        //判断一下发红包的钱是否超出金额
        if (allMoney < sendmoney) {
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(allMoney-sendmoney);
        //算出每份红包多少钱以及可能余下的钱
        int avg = sendmoney / count;
        int mod = sendmoney % count;
        //把红包添加到集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        //最后一个红包（有剩下的）放入集合
        redList.add(avg + mod);
        return redList;


    }
}

