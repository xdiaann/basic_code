package 基础和基础加强.jiuyeDay01;

public class zuoye03 {
    public static void main(String[] args) {
        /*String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true

        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2);//false  X  true
        System.out.println(s1.equals(s2));//true*/

        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3 == s2);//true  X  false
        System.out.println(s3.equals(s2));//true
    }
}
