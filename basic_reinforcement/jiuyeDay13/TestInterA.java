package jiuyeDay13;

public class TestInterA {
    public static void main(String[] args) {
        method(new InterA() {
            @Override
            public int changeType(String c) {
                return Integer.parseInt(c);
            }
        });
        method(s -> Integer.parseInt(s));
        method(Integer::parseInt);

    }
    public static void method(InterA a){
        int i = a.changeType("100");
        System.out.println(i);
    }
}
