package jiuyeDay08;

public class zuoye02 {
    //第二题：使用递归计算1-5的阶乘
    public static void main(String[] args) {
        System.out.println(jc(5));
    }

    private static int jc(int i) {
        if (i==1){
            return 1;
        }
        return i*jc(i-1);

    }
}
