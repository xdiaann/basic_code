package 基础和基础加强.day04;

public class 整数转二进制和位或位与异或 {
    public static void main(String[] args) {
        intToBinary();
    }

    private static void intToBinary() {
        int i = 5;
        String b = Integer.toBinaryString(i); // 5的二进制的表达101
        System.out.println(i + " 的二进制表达是: " + b);

        位或();
    }

    private static void 位或() {
        int i = 5;
        int j = 6;

        System.out.println(Integer.toBinaryString(i)); //5的二进制是101

        System.out.println(Integer.toBinaryString(j)); //6的二进制是110
        //位或 | 运算规则：参加运算的两个数只要两个数中的一个为1，结果就为1。  0 | 0= 0 ,  1 | 0= 1  ， 0 | 1= 1  ,  1 | 1= 1 。 25% 0 75%1
        //位与 & 运算规则：只有两个数的二进制同时为1，结果才为1，否则为0       0 & 0= 0 ， 0 & 1= 0，1 & 0= 0， 1 & 1= 1。          75% 0 25%1
        //异或 ^ 相同为1不同为0                                              0 ^ 0=0  ， 0 ^ 1= 1  ， 1 ^ 0= 1  ， 1 ^ 1= 0 。  50% 0 50%1
        System.out.println(5 | 6); // 5|6 对每一位进行位或运算，得到 111->7
        System.out.println(5 & 6); // 5|6 对每一位进行位与运算，得到 100->4
        System.out.println(5 ^ 6); // 5|6 对每一位进行异或运算，得到 011->3
    }
}
