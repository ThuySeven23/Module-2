package access_modifier;
class Circle{
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }
    Circle(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return getRadius() * getRadius() * 3.14;
    }
}
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        System.out.println("Radius1: " + circle1.getRadius());
        System.out.println("Area1: " + circle1.getArea());
        System.out.println("Radius2: " + circle2.getRadius());
        System.out.println("Area2: " + circle2.getArea());
    }
}

