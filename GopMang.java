package gop_mang;


import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo 2 mảng số nguyên có kích thước là 5");
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của arr1 : ");
            int valueArr = sc.nextInt();
            arr1[i] = valueArr;
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của arr2 : ");
            int valueArr = sc.nextInt();
            arr2[i] = valueArr;
        }

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));

        System.arraycopy(arr1 , 0 , arr3 , 0 , arr1.length);
        System.arraycopy(arr2 , 0 , arr3 ,  arr1.length , arr2.length);

        System.out.println("Array 3 : " + Arrays.toString(arr3));

    }
}
