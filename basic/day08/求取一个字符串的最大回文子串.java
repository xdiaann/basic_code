package day08;

public class 求取一个字符串的最大回文子串 {
    public static void main(String[] args) {
        longestPalindrome("aba");
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        int maxlength = 0;
        int start = 0;

        for (int i = 0; i < length; i++)//长度为奇数
        {
            int j = i - 1, k = i + 1;
            while (j >= 0 && k < length && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxlength) {
                    maxlength = k - j + 1;
                    start = j;
                }
                j--;
                k++;
            }
        }

        for (int i = 0; i < length; i++)//长度为偶数
        {
            int j = i, k = i + 1;
            while (j >= 0 && k < length && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxlength) {
                    maxlength = k - j + 1;
                    start = j;
                }
                j--;
                k++;
            }
        }
        if (maxlength > 0)
            return s.substring(start, start + maxlength);
        return s.substring(0, 1);
    }
}


