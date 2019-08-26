package 基础和基础加强.day09.DemoFaHongBao;

import java.util.ArrayList;
/*群主发普通红包
1，群主的一笔金额，从群主余额中扣除，平均成n等份，让成员领取
2，成员领取红包后，保存到成员余额中
*/
public class TsetQunZhuFaHongBao {
    public static void main(String[] args) {
        QunZhu qunZhu=new QunZhu("laoda",111);
        QunChengYuan qunChengYuan =new QunChengYuan("a",0);
        QunChengYuan qunChengYuan1 =new QunChengYuan("b",0);
        QunChengYuan qunChengYuan2 =new QunChengYuan("c",0);
        qunZhu.show();
        qunChengYuan.show();
        qunChengYuan1.show();
        qunChengYuan2.show();
        System.out.println("===============");
        ArrayList<Integer> redList=qunZhu.send(20,3);
        qunChengYuan.shouRed(redList);
        qunChengYuan1.shouRed(redList);
        qunChengYuan2.shouRed(redList);
        qunZhu.show(  );
        qunChengYuan.show();
        qunChengYuan1.show();
        qunChengYuan2.show();

    }
}
