package 基础和基础加强.day08;

public class lianxi {
    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        char[] charArray = {'1', '2', '3'};
        System.out.println(charArray);//123
        String c = new String(charArray);
        System.out.println(c);//123
        //比较
        System.out.println(c.equals(b));
        System.out.println("=========");
        String str1 = "HelloWorld";
        //sub
        String str2 = str1.substring(1);
        System.out.println(str2);

        String str3 = str1.substring(4, 8);
        System.out.println(str3);
        System.out.println("============");

        char[] str4 = str1.toCharArray();
        byte[] str5 = "abc".getBytes();
        System.out.println(str4[1]);
        System.out.println(str4.length);
        System.out.println(str5[0]);
        //replace 替换
        String str6 = str1.replace("o", "*");
        System.out.println(str6);
        String str7 = "aaa,bbb,ccc";
        String[] array1 = str7.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);

        }
    }
}
