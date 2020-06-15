package week8911.week8.week9;

public class Shape {
    private String color ="red";
    private boolean filled =true;

    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public String toString(){
        return "Shape[color="+color+"filled="+filled+"]";
    }
}
/*class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public String toString(){
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}*/
class Rectangle extends Shape{
    private double width = 1.0;
    private double length =1.0;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    public String toString(){
        return "REctangle["+super.toString()+",width="+width+",length="+length+"]";
    }
}
class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide(){
        return this.getLength();
    }
    public void setSide(double side){
        this.setLength(side);
    }
    public void setWidth(double side){
        this.setWidth(side);
    }
    public void setLength(double side){
        this.setLength(side);
    }
    public String toString(){
        return "Square["+super.toString()+"]";
    }

    public static void main(String[] args) {
        Square square = new Square(5,"red", true);
        System.out.println(square.toString());
    }
}
