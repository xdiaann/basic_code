package 基础和基础加强.day08;

public class Test01 {
    public static void main(String[] args) {
        String s = "abcde";
        //转换为字符数组，遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("--------------");
        //转换为
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]);// 97 98 99 100 101
        }
        System.out.println();
        System.out.println("--------------");
        //替换
        String replace = s.replace("a", "A");
        System.out.println(replace);
        System.out.println("----------------");
        String s1 = "aa|bb|cc";
        //分割
        String[] split = s1.split("|");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]);
            
        }
    }
}
