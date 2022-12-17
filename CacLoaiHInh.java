package hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class CacLoaiHInh {
    public static void main(String[] args) {
        System.out.println(
                "Please select the image you want to print:\n" +
                        "1. Print the rectangle\n" +
                        "2. Print the square triangle\n" +
                        "3. Print isosceles triangle\n" +
                        "4. Exit"
        );
        System.out.print("Please enter (1-4): ");
        Scanner sc = new Scanner(System.in);
        int select;

     do {
         select = sc.nextInt();
         if (select < 4){
             switch (select){
                 case 1:
                     rectangle();
                     System.out.print("Please enter another:");
                     break;
                 case 2:
                     squareTriangle();
                     System.out.print("Please enter another:");
                     break;
                 case 3:
                     isoscelesTriangle();
                     System.out.print("Please enter another:");
                     break;
             }
         }
     }while (select != 4);

    }
    //--------------------------------------------------

    public static void rectangle() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void squareTriangle() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void isoscelesTriangle() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
