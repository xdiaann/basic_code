package day04;

public class 将一个整数转换二进制 {
    public static void main(String[] args) {
       intToBinary();
    }

    private static void intToBinary() {
        int i = 5;
        String b = (Integer.toBinaryString(i)); // 5的二进制的表达101
        System.out.println(i+" 的二进制表达是: "+b);
        位或();
    }

    private static void 位或() {
        int i  =5;
        int j = 6;

        System.out.println(Integer.toBinaryString(i)); //5的二进制是101

        System.out.println(Integer.toBinaryString(j)); //6的二进制是110

        System.out.println(5|6); //所以 5|6 对每一位进行或运算，得到 111->7
    }
}
