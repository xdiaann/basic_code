package day10.zuoye03;

public class SiYangYuan {
    public void siyang(DongWu dongWu){
        dongWu.drink();
        dongWu.eat();

        if (dongWu instanceof Dog){
            Dog dog =(Dog)dongWu;
            dog.swimming();
        }
        if (dongWu instanceof QingWa){
            QingWa qingWa =(QingWa)dongWu;
            qingWa.swimming();
        }

    }
}
