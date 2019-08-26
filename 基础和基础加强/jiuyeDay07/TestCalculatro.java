package 基础和基础加强.jiuyeDay07;

public class TestCalculatro {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        invokeCalc(10, 20,(int a, int b)-> {
                return a+b;
            }
        );
        //简化模式
        invokeCalc(10, 20, (a, b) -> a + b);
        Calculator c=(a,b)->{return a-b;};
    }
    public static void invokeCalc(int a,int b,Calculator c){
        int sum=c.calc(a,b);
        System.out.println(sum);
    }
}
