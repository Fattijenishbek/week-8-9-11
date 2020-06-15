package week8911.week8.week9;

public class Ball {
    private float x;
    private float y;
    private float z;

    public Ball(float x, float y, float z){
        this.x =x;
        this.y =y;
        this.z =z;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float getZ(){
        return z;
    }
    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String toString(){
        return "("+x+","+y+","+z+")";
    }
}
class Player{
    private int number;
    private float x;
    private float y;
    private float z =0.0f;

    public Player(int number, float x, float y){
        this.number =number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp, float yDisp){
        this.x=xDisp;
        this.y=yDisp;
    }
    public void jump(float zDisp){
        this.z = zDisp;
    }
    public Boolean near(Ball ball){
        if(Math.sqrt(Math.pow((ball.getX()-this.x),2)+Math.pow((ball.getY()-this.y),2)+Math.pow((ball.getZ()+this.z),2))<8)
        return true;
        else return false;
    }
    public void kick(Ball ball){
    }
}
