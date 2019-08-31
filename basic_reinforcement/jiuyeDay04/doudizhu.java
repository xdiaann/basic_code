package jiuyeDay04;

import java.util.ArrayList;
import java.util.Collections;

public class doudizhu {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        //存储花色数字
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
        //创建一个牌盒
        ArrayList<String> poker = new ArrayList<>();
        ArrayList<Integer> indexs = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                poker.add(colors.get(j) + numbers.get(i));
                indexs.add(index++);
            }
        }
        poker.add("小王");
        indexs.add(index++);
        poker.add("大王");
        indexs.add(index);
        // Collections.shuffle(poker);
        System.out.println(poker);
        Collections.shuffle(indexs);

        System.out.println(indexs);

        ArrayList<Integer> 周润发 = new ArrayList<>();
        ArrayList<Integer> 刘德华 = new ArrayList<>();
        ArrayList<Integer> 周星驰 = new ArrayList<>();

        for (int i = 0; i < indexs.size() - 3; i++) {
            if (i % 3 == 0) {
                周润发.add(indexs.get(i));
            } else if (i % 3 == 1) {
                刘德华.add(indexs.get(i));
            } else if (i % 3 == 2) {
                周星驰.add(indexs.get(i));
            }
        }


        Collections.sort(周润发);
        Collections.sort(刘德华);
        Collections.sort(周星驰);
        System.out.println("=========");
        System.out.print("周润发：");
        for (int i = 0; i < 周润发.size(); i++) {
            System.out.print(poker.get(周润发.get(i)) + " ");
        }
        System.out.println();
        System.out.print("刘德华：");
        for (int i = 0; i < 刘德华.size(); i++) {
            System.out.print(poker.get(刘德华.get(i)) + " ");
        }
        System.out.println();
        System.out.print("周星驰：");
        for (int i = 0; i < 周星驰.size(); i++) {
            System.out.print(poker.get(周星驰.get(i)) + " ");
        }
        System.out.println();
        System.out.print("底牌：");
        for (int i = indexs.size() - 3; i < indexs.size(); i++) {
            System.out.print(poker.get(indexs.get(i)) + " ");
        }

    }
}


