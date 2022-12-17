package dem_so_ki_tu_trong_chuoi;

import java.util.Scanner;

public class DemSoKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str="tranhuuthuy";
        char c;

        System.out.println("Chuỗi cho trước: " + str);
        System.out.print("Nhập vào kí tự muốn đếm số lần xuất hiện:");
        c = sc.next().charAt(0);
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == c){
                count++;
            }
        }
        System.out.print("Kí tự '" + c + "' xuất hiện trong chuỗi: " + count + " lần.");
    }
}
