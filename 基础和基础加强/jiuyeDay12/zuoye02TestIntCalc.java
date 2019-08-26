package 基础和基础加强.jiuyeDay12;

public class zuoye02TestIntCalc {
    static void getProduct(int a,int b,IntCalc calc){
        System.out.println(calc.calc(a, b));
    }

    public static void main(String[] args) {
        getProduct(30, 20, new IntCalc() {
            @Override
            public int calc(int a, int b) {
                return a*b;
            }
        });
    }
}
