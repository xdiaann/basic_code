package 基础和基础加强.jiuyeDay03;

public class Demo02 {
    public static void main(String[] args) {
        print(1, 2, 3, 4);
        method(new Person("zsdf", 13), new Person("qwe", 32));
    }

    public static void print(int... num) {
        for (int i : num) {
            System.out.println(i);
        }
    }

    public static void method(Person... p) {
    }
}
