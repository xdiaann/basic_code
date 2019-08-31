package day10.zuoye03;

public class Test {
    public static void main(String[] args) {
        SiYangYuan siYangYuan = new SiYangYuan();
        Dog dog = new Dog();
        siYangYuan.siyang(dog);
       siYangYuan.siyang(new QingWa());
       siYangYuan.siyang(new Yang());
    }
}
