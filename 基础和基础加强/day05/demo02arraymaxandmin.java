package 基础和基础加强.day05;

public class demo02arraymaxandmin {
    public static void main(String[] args) {
        int[] array = {1,123,13,131234,0,-21,-321,23434, 23, 41, 3213, 32};
        int max =array[0];
        int min =array[0];
        for (int i = 1; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
            }else if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
