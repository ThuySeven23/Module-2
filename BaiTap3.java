package ung_dung_doi_tien_te;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        final int RATE_VND = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập USD vào:");
        double USD = sc.nextDouble();
        System.out.println("Tiền USD đổi ra tiền Việt là : " + (int)(USD * RATE_VND) + " nghìn đồng");
    }
}
