package tinh_tong_o_mot_cot_xac_dinh_mang_2_chieu;

import java.util.Scanner;

public class TinhTongOCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tính tổng một cột xác định trong mảng 2 chiều .");
        int[][] matrix = {
                {10,27,37,42,54},
                {57,61,11,30,39},
                {18,13,21,20,14},
                {31,26,17,86,59},
                {60,23,17,22,82}
        };
        System.out.println("Mảng 2 chiều gồm " + matrix.length + " hàng và " + matrix[0].length + " cột");
        // i : row , j : column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Chọn 1 cột ở mảng 2 chiều trên để tính tổng: ");
        int columnSelect = sc.nextInt();
        
        int total = 0;
        switch (columnSelect){
            case 1:
                for (int j = columnSelect - 1; j < matrix[0].length - 4; j++) {
                    for (int i = 0; i < matrix.length; i++) {
                        total += matrix[i][j];
                    }
                }
                System.out.println("Tổng của cột 1 của mảng 2 chiều là : " + total);
                break;
            case 2:
                for (int j = columnSelect - 1; j < matrix[0].length - 3; j++) {
                    for (int i = 0; i < matrix.length; i++) {
                        total += matrix[i][j];
                    }
                }
                System.out.println("Tổng của cột 2 của mảng 2 chiều là : " + total);
                break;
            case 3:
                for (int j = columnSelect - 1; j < matrix[0].length - 2; j++) {
                    for (int i = 0; i < matrix.length; i++) {
                        total += matrix[i][j];
                    }
                }
                System.out.println("Tổng của cột 3 của mảng 2 chiều là : " + total);
                break;
            case 4:
                for (int j = columnSelect - 1; j < matrix[0].length - 1; j++) {
                    for (int i = 0; i < matrix.length; i++) {
                        total += matrix[i][j];
                    }
                }
                System.out.println("Tổng của cột 4 của mảng 2 chiều là : " + total);
                break;
            case 5:
                for (int j = columnSelect - 1; j < matrix[0].length; j++) {
                    for (int i = 0; i < matrix.length; i++) {
                        total += matrix[i][j];
                    }
                }
                System.out.println("Tổng của cột 5 của mảng 2 chiều là : " + total);
                break;
        }









    }
}
