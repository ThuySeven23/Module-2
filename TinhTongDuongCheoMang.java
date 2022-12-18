package tinh_tong_duong_cheo_cua_ma_tran_mang_2_chieu;

import java.util.Scanner;

public class TinhTongDuongCheoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Array has " + matrix.length + " row and " + matrix[0].length + " column." );

        System.out.println("Input value of matrix["+row+"]["+column+"]");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("matrix["+i+"]["+j+"] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------");
        System.out.println("matrix["+row+"]["+column+"]");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j){
                    total += matrix[i][j];
                }
            }

        }
        System.out.println("Total diagonal is : " + total);

    }
}
