package 基础和基础加强.day05;
//数组作为方法的参数,传递地址
//当调用方法的时候，向方法的小括号进行传参，
public class Demo05Arrayparam {
    public static void main(String[] args) {
        int[] qq={1,2,3,4,5,6,7,8};
        printArray(qq);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
