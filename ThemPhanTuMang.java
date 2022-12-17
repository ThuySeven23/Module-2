package them_phan_tu_mang;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        System.out.println("Mang dau tien bao gom : " + Arrays.toString(arr));

        System.out.println("Nhap gia tri phan tu can chen:");
        int newElementArray = input.nextInt();
        System.out.println("Nhap vi tri muon chen:");
        int indexArr = input.nextInt();

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        if (indexArr <= 1 || indexArr >= (arr.length - 1)) {
            System.out.println("Khong chen duoc");
        } else {
            for (int i = (newArr.length - 1); i >= indexArr; i--) {
                newArr[i] = newArr[(i - 1)];
            }
            newArr[indexArr] = newElementArray;
        }
        System.out.println(Arrays.toString(newArr));
    }
}