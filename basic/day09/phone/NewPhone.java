package day09.phone;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
