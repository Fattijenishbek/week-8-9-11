package week8911.week8.week9;

public class Cylinder extends Circle{
    private double height =1.0;

    public Cylinder(){
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return 3.14*this.getRadius()*this.getRadius()*height;
    }
    public double getArea(){
        return 2*3.14*this.getRadius()*height+2*3.14*this.getRadius()*this.getRadius();
    }
    public  String toString(){
        return "Cylinder[radius="+this.getRadius()+",color="+this.getColor()+",height="+height+"]";
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(5,2,"blue");
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
