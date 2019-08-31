package day04;
//0-1000内 一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
public class    Demo01水仙花 {
    public static void main(String[] args) {
        int x = 0; //定义水仙花数的个数
        for(int i=100;i<=999;i++){
            //三种方式
            /*ge = i % 10;
            shi = i % 100 / 10;
            bai = i / 100;*/
            /*ge=i%10;
            shi=i/10%10;
            bai=i/100%10;*/
            int b = i/100; //取得百位数
            int s = (i-100*b)/10; //取得十位数
            int g = (i-s*10-b*100); //取得个位数
            if(i==g*g*g+s*s*s+b*b*b){
                x++; //每次符合水仙花数条件，则x+1;
                System.out.print(i+" "); //输出符合条件的数
            }
        }System.out.println(); //换行
        System.out.println("水仙花数总共有"+x+"个"); //输出水仙花数的总数
    }
}

