package week8911.week8;

public class MyPoint {
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

    public static void main(String[] args) {
       /* MyPoint myPoint=new MyPoint(1,1);
        MyPoint myPoint1=new MyPoint(5,4);
        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(5,4));
        System.out.println(myPoint.distance(myPoint1));*/

        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint();  // Test constructor
        System.out.println(p1);      // Test toString()
        p1.setX(8);   // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX());  // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);   // Test setXY()
        System.out.println(p1.getXY()[0]);  // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));    // which version?
        System.out.println(p2.distance(p1));    // which version?
        System.out.println(p1.distance(5, 6));  // which version?
        System.out.println(p1.distance());      // which version?
    }
}
