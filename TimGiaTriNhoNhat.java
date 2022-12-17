package tim_gia_tri_nho_nhat_mang;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập mảng vị trí thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng tạo được : arr[] = " + Arrays.toString(arr));
        int GTNN = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < GTNN){
              GTNN = arr[i];
            }
        }
        System.out.println("GTNN trong mang la: " + GTNN );




    }
}
