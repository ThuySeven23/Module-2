package point_and_moveablepoint;

class Point{
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x , float y){
        this.x = x;
        this.y = y;
    }
    public Point(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arrXY = {getX() , getY()};
        return arrXY;
    }
    public String toString(){
        return "Point (" + getX() + " , " + getY() + ")";
    }
}
class MoveAblePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(float x , float y , float xSpeed , float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(){
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed = {getxSpeed() , getySpeed()};
        return arrSpeed;
    }
    @Override
    public String toString(){
        return "Point (" + getX() + " , " + getY() + ")\n" +
                "Speed = (" + getxSpeed() + " , " + getySpeed() + ")"
                ;
    }
    public MoveAblePoint move(){
        this.setX(this.getX() + this.getxSpeed());
        this.setY(this.getY() + this.getySpeed());
        return this;
    }
}




public class PointAndMoveAblePoint {
    public static void main(String[] args) {
            MoveAblePoint car1 = new MoveAblePoint();
            System.out.println("Setting for car1");
            car1.setX(6);
            car1.setY(7);
            car1.setxSpeed(50);
            car1.setySpeed(50);
            System.out.println(car1.toString());

            System.out.println();
            
            System.out.println("Setting for car2");
            MoveAblePoint car2 = new MoveAblePoint(4 , 5, 60 ,75);
            System.out.println(car2.toString());
    }
}
