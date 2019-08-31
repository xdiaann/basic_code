package jiuyeDay12;

public class DemoTestFunction {
    //定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show(MyFunctionalInterface fun){
        //该接口下有一个抽象方法
        fun.method();
    }

    public static void main(String[] args) {
        //调用show方法，show方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());
        //调用show方法，show方法的参数是一个接口，所以可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //简化Lambda
        show(()->System.out.println("使用lambda表达式重写接口中的抽象方法"));
    }
}
