package jiuyeDay07.lambaCalc;

public class TestCalculatro {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //简化模式
        invokeCalc(10, 20, (a, b) -> a + b);
        //方法引用
        invokeCalc(10, 20, Integer::sum);
        invokeCalc(10, 20, (a, b) -> a - b);
    }
    public static void invokeCalc(int a,int b,Calculator c){
        int result=c.calc(a,b);
        System.out.println(result);
    }
}
