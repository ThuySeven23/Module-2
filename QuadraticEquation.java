package xay_dung_lop_phuong_trinh_bac_2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1(){
        return ( (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));
    }
    public double getRoot2(){
        return ( (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Phuong trinh bac hai ax^2 + bx + c = 0 \n"
                + " a = " + quadraticEquation.getA() + "\n"
                + " b = " + quadraticEquation.getB() + "\n"
                + " c = " + quadraticEquation.getC()
        );

        if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if (quadraticEquation.getDiscriminant() > 0 ) {
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        }
        else {
            System.out.println("x1 = x2 = " + ( (-quadraticEquation.getB()) / (2* quadraticEquation.getA())));
        }


    }


}
