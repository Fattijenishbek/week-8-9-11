package week8911.week8;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day=day;
        this.month =month;
        this.year=year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        int day1=Integer.parseInt(String.format("%02",day));
        int month1=Integer.parseInt(String.format("%02",month));
        int year1=Integer.parseInt(String.format("%04",year));
        return day1+"/"+month1+"/"+year1;
    }
}
