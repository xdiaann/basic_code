package day11.monikaoshi02;

import java.util.ArrayList;

public class Factorylmp extends Hat implements Factory {
    @Override
    public void describe(Hat hat) {
        if (hat.getColor()%2==0){
            System.out.println("该帽子是黄色"+hat.getType()+","+hat.getPrice());
        }else {
            System.out.println("该帽子是红色"+hat.getType()+","+hat.getPrice());
        }
    }

    @Override
    public ArrayList<Hat> piliang(int num) {
        return null;
    }


}
