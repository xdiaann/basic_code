package day08;

/*定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式如下
{word1#word2#word3}
 */
public class Stringpractise {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println(fromArrayToString(arr1));
    }

    public static String fromArrayToString(int[] arr1) {
        String str = "{";
        for (int i = 0; i < arr1.length; i++) {
            if (arr1.length - 1 == i) {
                str += "word" + arr1[i] + "}";
            } else {
                str += "word" + arr1[i] + "#";

            }
        }
        return str;
    }
}

