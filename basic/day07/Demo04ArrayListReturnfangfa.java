package day07;

import java.util.ArrayList;
import java.util.Random;

//三要素
//返回值类型   ArrayList<Integer> smallList
//方法名称  getSamllList
//参数列表  ArrayList<Integer> bigList
public class Demo04ArrayListReturnfangfa {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);   //把随机数放入大集合
        }
        ArrayList<Integer> a = getSmallList(bigList);
        System.out.println("偶数总共有多少个：" + a.size());
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i) % 2 == 0) {
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }

}

/* OR
    public static void main(String[] args) {

        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(random.nextInt(100));
        }
        smallList(bigList);
    }

    public static void smallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i) % 2 == 0) {
                smallList.add(bigList.get(i));
            }
        }
        System.out.println("偶数总共有多少个:" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i) + " ");
        }
    }
}*/
