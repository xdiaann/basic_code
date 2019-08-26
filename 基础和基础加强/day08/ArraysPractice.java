package 基础和基础加强.day08;

import java.util.Arrays;

public class ArraysPractice {
        public static void main(String[] args) {
            //元素反转
            String str="qwoejOJIOJQWekjwqo";
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            System.out.println(chars);
            System.out.println("============");
            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
        }
    }


