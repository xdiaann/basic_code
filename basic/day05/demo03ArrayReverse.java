package day05;

//求反转代码,将1234输出为4321,即元素反转
public class demo03ArrayReverse {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77};
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            //定义第三个数，用倒手的方式实现元素交换
            int temp = 0;
            temp = array[max];
            array[max] = array[min];
            array[min] = temp;
        }

        for (int i1 : array) {
            System.out.print(i1 + ",");
        }
    }
}
