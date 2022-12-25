package lop_circle_va_lop_cylinder;

class Circle{
    double radius;
    String color;

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    double area(){
        return  radius * radius * 3.14;
    }

    String tostring(){
        return "Caculate the area of a circle: \n" +
                "Radius : " + getRadius() + "\n" +
                "Color : " + getColor() + "\n" +
                "=> " + area()
                ;
    }

}

class Cylinder extends Circle{
    double height;

    double getHeight() {
        return height;
    }
    void setHeight(double height) {
        this.height = height;
    }

    double volume(){
        return getRadius() * getRadius() * getHeight() * 3.14;
    }
    @Override
    String tostring(){
        return "Caculate the volume of the cylinder: \n" +
                "Height : " + getHeight() + "\n" +
                "Radius : " + getRadius() + "\n" +
                "Color : " + getColor() + "\n" +
                "=> " + volume()
                ;
    }
}


public class CircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        circle.setRadius(3.5);
        circle.setColor("Blue");
        System.out.println(circle.tostring());

        System.out.println();
        cylinder.setHeight(5.5);
        cylinder.setRadius(4);
        cylinder.setColor("Yellow");
        System.out.println(cylinder.tostring());

    }
}
