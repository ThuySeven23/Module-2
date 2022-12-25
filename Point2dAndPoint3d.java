package poin2d_and_point3d;


import java.util.Arrays;

class Point2D{
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x , float y){
        this.x = x;
        this.y = y;
    }
    public Point2D(){
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arrXY = {this.x , this.y};
        return  arrXY;
    }
    public String toString(){
        return "Poin2D: (" + getX() +  " , " + getY() + ")";
    }

}
class Point3D extends Point2D{
    private float z = 0.0f;
    Point3D(float x , float y , float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x , float y , float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arrXYZ = {this.getX() , this.getY() , this.z};
        return arrXYZ;
    }

    @Override
    public String toString() {
        return "Poin3D: (" + getX() +  " , " + getY() + " , " + getZ() + ")";
    }

}

public class Point2dAndPoint3d {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(3.0f , 4.0f);
        Point3D p3 = new Point3D(5.0f , 6.0f , 7.0f);
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println();

        System.out.print("Point2D(xy) : " );
        p2.setXY(5.7f , 6.2f);
        System.out.println(Arrays.toString(p2.getXY()));

        System.out.print("Point3D(xyz) : " );
        p3.setXYZ(3.4f , 5.5f , 8.9f);
        System.out.println(Arrays.toString(p3.getXYZ()));
    }
}
