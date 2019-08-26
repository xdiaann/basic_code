package 基础和基础加强.jiuyeDay07;

public class LambdaCook {
    public static void main(String[] args) {
        method(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        method(() -> { System.out.println("吃饭了"); });
    }

    private static void method(Cook c) {
        c.makeFood();
    }
}
