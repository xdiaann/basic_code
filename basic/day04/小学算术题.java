package day04;

public class 小学算术题 {
    public static void main(String[] args) {
        //a+b=8  a+c=14 b+d=10 c-d=6 算出abcd的值
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                for (int c = 0; c < 100; c++) {
                    for (int d = 0; d < 100; d++) {
                        if (a+b==8&&a+c==14&&b+d==10&&c-d==6){
                            System.out.println(a);
                            System.out.println(b);
                            System.out.println(c);
                            System.out.println(d);
                        }
                    }
                }
            }
        }

    }
}
