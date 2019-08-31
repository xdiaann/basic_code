package day08;

public class Test02 {
    public static void main(String[] args) {
        byte[] b = {'a', 'b', 'c'};
        String str=new  String (b);
        System.out.println(str);

        byte[] b1 = {97, 98, 99};
        String str1=new String (b1);
        System.out.println(str1);

        String s ="helloworld";
        String s2=s.concat("**hello itheima");
        System.out.println(s2);
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("lo"));
        System.out.println("---------");
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println(s.substring(3, 8));
        System.out.println(s.substring(3,s.length()));
    }
}
