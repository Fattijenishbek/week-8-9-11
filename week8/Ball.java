package week8911.week8;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius,int speed, int direction){
        this.x =x;
        this.y=y;
        this.radius=radius;
        this.xDelta= (float) (speed*Math.cos(direction));
        this.yDelta= (float) (-speed*Math.sin(direction));
    }
    public float getX() {
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
    public int  getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public float getxDelta(){
        return xDelta;
    }
    public void setxDelta(float xDelta){
        this.xDelta=xDelta;
    }
    public float getyDelta(){
        return yDelta;
    }
    public void setyDelta(float yDelta){
        this.yDelta=yDelta;
    }
    public void move(){
        x+=xDelta   ;
        y+=yDelta;
    }
    public void reflectionHorizontal(){
        this.xDelta=-xDelta;
    }
    public void reflectionVertical(){
        this.yDelta=-yDelta;
    }
    public String toString(){
        return "Ball[("+x+","+y+")"+"speed=("+xDelta+","+yDelta+")]";
    }
}
/*class Container  {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private Container(int x, int y, int width, int height){
        this.x1=x;
        this.y1=y;
        this.x2=x1+width-1;
        this.y2=y1+height-1;
    }
    public int getX(){
        return x2-x1;
    }
    public int getY(){
        return y2-y1;
    }
    public int getWidth(){
        return x2-x1+1;
    }
    public int getHeight(){
        return y2-y1+11;
    }
    public boolean colllides(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2 ) {
            ball.reflectionHorizontal();
            return true;
        }else
        if(ball.getY()-ball.getRadius()<=this.y1 || ball.getY()-ball.getRadius() >= this.y2){
            ball.reflectionVertical();
            return true;
        } else return false;
    }

    public String toString(){
        return "Container[("+x1+","+y1+"),"+"("+x2+","+y2+")]";
    }
}*/

