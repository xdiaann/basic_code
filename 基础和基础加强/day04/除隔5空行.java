package 基础和基础加强.day04;

public class 除隔5空行 {
    public static void main(String[] args) {
        int five = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9 || (i / 10 % 10) == 9) {
                continue;
            }
            if (five % 5 == 0) {
                System.out.println();
            }
            five++;
            System.out.print(i + " ");
            five++;
        }
    }

}
