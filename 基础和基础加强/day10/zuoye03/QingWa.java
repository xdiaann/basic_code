package 基础和基础加强.day10.zuoye03;

public class QingWa extends DongWu implements Swim {
    @Override
    public void eat() {
        System.out.println("青蛙吃小虫");
    }

    @Override
    public void swimming() {
        System.out.println("青蛙会游泳");
    }
}
