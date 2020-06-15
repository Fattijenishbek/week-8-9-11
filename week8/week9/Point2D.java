package week8911.week8.week9;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D() {
        this.x=0.0f;
        this.y=0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return this.y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float [] arr= {this.x,this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
        super();
        this.z = 0.0f;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] arr={this.getX(), this.getY(), z};
        return arr;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D(1.1f,2.2f);
        System.out.println(point2D);
        System.out.println(point2D.getX()+" "+point2D.getY());
        point2D.setXY(3.3f,4.4f);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D.toString());

        Point3D point3D=new Point3D(7.7f,8.8f,9.9f);
        System.out.println(point3D);
        System.out.println(point3D.getX()+" "+point3D.getY());
        point3D.setXYZ(1.2f,1.3f,1.4f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());
    }
}
