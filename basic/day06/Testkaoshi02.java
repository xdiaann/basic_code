package day06;
//  写两个方法分别统计5位数的
// 回文数个数和7位数的回文数个数，并将个数返回，
// 最后拿到两个方法的返回值，计算出两种回文数
// 相差的个数。（注：5位数的回文数 如:12321,22122
//   7位数的回文数 如:1234321,7844487 ）
public class Testkaoshi02 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 10000; i <=99999 ; i++) {
            int wan=i/10000%10;
            int qian=i/1000%10;
            int shi=i/10%10;
            int ge=i%10;
            if(wan==ge&&qian==shi){
                sum+=1;
            }
        }
        int sum1=0;
        for (int i = 1000000; i <=9999999 ; i++) {
            int baiwan=i/1000000%10;
            int shiwan=i/100000%10;
            int wan=i/10000%10;
            int bai=i/100%10;
            int shi=i/10%10;
            int ge=i%10;
            if(baiwan==ge&&shiwan==shi&&wan==bai){
                sum1+=1;
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum1-sum);
    }
}
