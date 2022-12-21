package xay_dung_lop_fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }


    public Fan(){
    }

    public String toString(){
        if (getOn() == true){
            return "speed " + getSpeed() + ", radius " + getRadius() + ", color " + getColor() + " (fan is on !)";
        }
        else {
            return "speed " + getSpeed() + ", radius " + getRadius() + ", color " + getColor() + " (fan is off !)";
        }
    }
    public static void main(String[] args) {
        Fan senko = new Fan();
        Fan panasonic = new Fan();
        System.out.println("Có 2 cái quạt : quạt senko và quạt panasonic");
        // Senko
        senko.setSpeed(3);
        senko.setRadius(10);
        senko.setColor("yellow");
        senko.setOn(true);
        System.out.println("Quạt senko có : " + senko.toString() );
        // Panasonic
        panasonic.setSpeed(2);
        System.out.println("Quạt panasonic có : " + panasonic.toString() );

    }

}
