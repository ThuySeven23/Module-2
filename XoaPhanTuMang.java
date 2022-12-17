package xoa_phan_tu_mang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {

        int[] arr = {2,1,5,6,6,5,7,10};
        System.out.println( "Có " + arr.length +" phần tử trong mảng gồm : " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Phần tử muốn xóa : ");
        int x = sc.nextInt();
        List<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != x ){
                newArr.add(arr[i]);
            }
            if (arr[i] == x){
                System.out.println("Thuộc vị trí : " + i);
            }
        }
        System.out.println("Mảng còn lại là : " + newArr);



    }
}
