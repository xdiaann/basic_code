package day06.managerAndCoder;

public class TestManager {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setBonus(6000);
        manager.setSalary(15000);
        manager.setId(123);
        manager.work();
        manager.print();
        Coder coder=new Coder();
        coder.setId(135);
        coder.setSalary(10000);
        coder.work();
        coder.print();
    }

}
