package week8911.week8;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1= new MyPoint(x1,y1);
        v2= new MyPoint(x2,y2);
        v3= new MyPoint(x2,y3);
    }
    @Override
    public String toString() {
        return "MyTriangle[v1="+v1+",v2="+v2+",v3="+v3+"]";
    }
    public double getPerimeter(){
        return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
    }
    public String printType(){
        double a,b,c;
        a=v1.distance(v2);
        b=v2.distance(v3);
        c=v3.distance(v1);
        if(a==b & b==c) return "equilateral";
        else if(a==b | a==c | b==c) return "isosceles";
        else return "scalene";
    }
}

/*public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x){
        this.x=x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }

    public int[] getXY(){
        int [] arr= new int[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +")";
    }

    public double distance(int x1, int y1){
        double dis1=Math.sqrt(Math.pow((x-x1),2)+(Math.pow((y-y1),2)));
        return dis1;
    }
    public double distance(MyPoint another){
        double dis2=Math.sqrt(Math.pow((x-another.getX()),2)+(Math.pow((y-another.getY()),2)));
        return dis2;
    }
    public double distance(){
        double dis3=Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
        return dis3;
    }
}
*/