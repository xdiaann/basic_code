package day10.zuoye03;

public class Dog extends DongWu implements Swim {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗会狗刨游泳");
    }
}

