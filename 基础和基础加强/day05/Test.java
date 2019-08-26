package 基础和基础加强.day05;

public class Test {
    public static void main(String[] args) {
            int[] arr1 = {1,2,3,4,5};
            int[] arr2 = {5,6,7};
            int[] temp = arr1;
            System.out.println("通过temp取出arr1中的元素: ");
            for(int i = 0;i<temp.length;i++) {
                System.out.print(temp[i]+" ");
            }
            temp = arr2;
        System.out.println(" ");
            System.out.println("通过temp取出arr2中的元素: ");
            for(int i = 0;i<temp.length;i++) {
                System.out.print(temp[i]+" ");
            }
        }
    }
