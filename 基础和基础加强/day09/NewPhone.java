package 基础和基础加强.day09;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
