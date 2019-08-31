package day04;
//使用for循环,求出100-1000之间的个位
//不包含1十位不包含2百位不包含3的所有奇数之和.

//个位不包含1 ge%10=1
public class 数学题01 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 100; i < 1000; i++) {
            if (i%10==1||i/10%10==2||i/100%10==3||i%2==0){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}

