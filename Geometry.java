package trien_khai_interface_resizeable_cac_lop_hinh_hoc;
interface Resizeable{
    double PI = 3.14;
    void resize(double percent);
    double caculateOfArea();
    String toString();
}
class Circle implements Resizeable{
    double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public void resize(double percent){
        System.out.println("This is Cricle");
        System.out.println("Size of Circle : " + percent);
    }
    @Override
    public double caculateOfArea(){
        return (getR() * getR() * PI);
    }

    @Override
    public String toString() {
        return "The Area of Circle: " + caculateOfArea();
    }
}
class Retangle implements Resizeable{
    double length , width;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void resize(double percent){
        System.out.println("This is Retangle");
        System.out.println("Size of Retangle : " + percent);
    }
    @Override
    public double caculateOfArea(){
        return (getLength() * getWidth());
    }

    @Override
    public String toString() {
        return "The Area of Retangle: " + caculateOfArea();
    }
}
class Square implements  Resizeable{
    double length;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void resize(double percent){
        System.out.println("This is Square");
        System.out.println("Size of Square : " + percent);
    }
    @Override
    public double caculateOfArea(){
        return (getLength() * getLength());
    }
    @Override
    public String toString() {
        return "The Area of Square: " + caculateOfArea();
    }
}

public class Geometry {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Retangle retangle = new Retangle();
        Square square = new Square();

        System.out.println("-----------------------------");
        circle.resize(30);
        circle.setR(4.0);
        System.out.println(circle.toString());
        System.out.println("-----------------------------");

        retangle.resize(45);
        retangle.setLength(32);
        retangle.setWidth(20);
        System.out.println(retangle.toString());
        System.out.println("-----------------------------");

        square.resize(50);
        square.setLength(8.0);
        System.out.println(square.toString());
        System.out.println("-----------------------------");


    }
}
