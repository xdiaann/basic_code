package 基础和基础加强.day06;

//使用for循环,求出100-1000之间的个位
// 个位不包含1  十位不包含2  百位不包含3的所有奇数之和.
public class Testkaoshi {
    public static void main(String[] args) {
        int sum = 0;
//        for (int x = 100; x < 1000; x++) {
//            int bai = x / 100 % 10;
//            int shi = x / 10 % 10;
//            int ge = x % 10;
//            if (ge == 1) {
//                continue;
//            } else if (shi == 2) {
//                continue;
//            } else if (bai == 3) {
//                continue;
//            } else if (x % 2 == 0) {
//                continue;
//            } else {
//                sum += x;
//            }
//        System.out.println(sum);
        for (int i = 100; i < 1000; i++) {
            if (i % 10 == 1 || i / 10 % 10 == 2
                    || i / 100 % 10 == 3 || i % 2 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}

