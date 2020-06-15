package week8911.week8.week9;

import java.util.Arrays;

public class Point {
    protected float x=0.0f;
    protected float y=0.0f;

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point(){
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float [] arr = {getX(), getY()};
        return arr;
    }
    public String toString(){
        return "("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point point = new Point();
        Point point1 = new Point(1.0f,2.0f);
        System.out.println(point);
        System.out.println(point1);
        point1.setXY(3,4);
        System.out.println(Arrays.toString(point1.getXY()));
        point.setXY(5,5);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
