package 基础和基础加强.day04;

public class Demo05qiuhe {
    public static void main(String[] args) {
        System.out.println(getsum());
        System.out.println(getsum01(55));
    }
    public static int getsum(){
        int sum =0;
        for(int a=0;a<=100;a++){
            sum+=a;
        }
        return sum;
    }
    public static int getsum01(int b){
        int sum =0;
        for(int a=0;a<=b;a++){
            sum+=a;
        }
        return sum;
    }
}
