package tim_gia_tri_lon_nhat_trong_mang_2_chieu;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {10,27,37,42,54},
                {57,61,7,30,39},
                {0,13,21,20,14},
                {31,26,17,52,8}
        };

        System.out.println("Mảng 2 chiều gồm " + matrix.length + " hàng và " + matrix[0].length + " cột");
        // i : row , j : column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int Max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Max < matrix[i][j]){
                    Max = matrix[i][j];
                }
            }
        }
        System.out.println("GTLN trong mảng : " + Max);

    }
}
