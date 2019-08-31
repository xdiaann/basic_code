package day08;

public class Test01 {
    public static void main(String[] args) {
        String s = "abcde";
        //转换为字符数组，遍历
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println(" ");
        System.out.println("--------------");
        //转换为
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte);// 97 98 99 100 101
        }
        System.out.println();
        System.out.println("--------------");
        //替换
        String replace = s.replace("a", "A");
        System.out.println(replace);
        System.out.println("----------------");
        String s1 = "aaWbbWcc";
        //分割
        String[] split = s1.split("W");
        for (String s2 : split) {
            System.out.print(s2 + " ");
        }

    }
}