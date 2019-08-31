package day07;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random r=new Random();
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {          //定义20次循环
            int num=r.nextInt(100)+1;    //1-100
            bigList.add(num);                   //把num添加到大循环
        }
        System.out.print("大集合中的集合为：");
        for (int i = 0; i < bigList.size(); i++) {
            System.out.print(bigList.get(i)+" ");
        }
        System.out.println();
        System.out.print("小集合中的集合为：");
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i)%2==0){
                System.out.print (bigList.get(i)+" ");
                smallList.add(bigList.get(i));
            }
        }
        System.out.println();

        System.out.println("偶数个数为："+smallList.size());
    }
}
