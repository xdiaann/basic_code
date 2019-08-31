package day05;

public class 动态静态数组定义格式 {

    public static void main(String[] args) {
        //动态数组
        int[] arrayA = new int[3];
        double[] arrayB = new double[10];
        String[] arrayC = new String[20];
        //静态数组
        int[] arrayD = new int[]{5, 15, 25};
        String[] arrayE = new String[]{"hello", "world", "java"};
        String[] arrayF = {"hello", "world", "java"};
        System.out.println(arrayE.length);
        //可以分成两步创建
        int[] arrayG;
        arrayG = new int[3];
        //遍历数组
        for (int i = 0; i < arrayE.length; i++) {
            System.out.print(arrayE[i]+"，");
        }
        System.out.println(" ");
        System.out.println(arrayD[1]);
        System.out.println("==========");
        System.out.println(arrayA[0]);
        arrayA[0] = 15;
        System.out.println(arrayA[0]);

    }

}
