package Demo_Try_Catch_Finally;

import java.util.Scanner;
class IllegalTriangleException extends Exception {
    private String error;

    public IllegalTriangleException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

}


public class DemoIllegalTriangle {
    static Scanner sc = new Scanner(System.in);
    static double a,b,c;
    static void checkThreeTriangle(double a , double b , double c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || c + b < a) {
            throw new IllegalTriangleException("Lỗi các cạnh trong tam giác");
        } else {
            throw new IllegalTriangleException("Tam giác hợp lệ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập 3 cạnh: ");
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.print("c = ");
        c = sc.nextDouble();
        try {
            checkThreeTriangle(a,b,c);
        } catch (IllegalTriangleException I){
            System.out.println(I.getError());
        }
    }
}
