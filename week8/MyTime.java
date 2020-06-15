package week8911.week8;

public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime(){
    }
    public MyTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public String toString() {
        int hour1 = Integer.parseInt(String.format("%02d", hour));
        int minute1 = Integer.parseInt(String.format("%02d", minute));
        int second1 = Integer.parseInt(String.format("%02d", second));
        return hour1 + ":" + minute1 + ":" + second1;
    }
    public MyTime nextSecond() {
        if (this.second < 59 && this.second>0) {
            this.second++;
        } else {
            this.second = 0;
            if(this.minute<59 && this.minute>0){
                this.minute++;
            }else {
                this.minute=0;
                if (this.hour<23 && this.hour>0){
                    this.hour++;
                }else this.hour=0;
            }
        }
        return this;
    }
    public MyTime nextMinute() {
        if(this.minute<59 && this.minute>0){
            this.minute++;
        }else {
            this.minute=0;
            if (this.hour<23 && this.hour>0){
                this.hour++;
            }else this.hour=0;
        }
        return this;
    }
    public MyTime nextHour(){
        if (this.hour<23 && this.hour>0){
            this.hour++;
        }else this.hour=0;
        return this;
    }

    public MyTime previousSecond() {
        if (this.second > 0 && this.second<60) {
            this.second--;
        } else {
            this.second = 59;
            if(this.minute>0 && this.minute<60){
                this.minute--;
            }else {
                this.minute=59;
                if(this.hour>0 && this.hour<24){
                    this.hour--;
                }else this.hour=23;
            }
        }
        return this;
    }
    public MyTime previousMinute() {
        if (this.minute > 0 && this.minute < 60) {
            this.minute--;
        } else {
            this.minute = 59;
            if (this.hour > 0 && this.hour < 24) {
                this.hour--;
            } else this.hour = 23;
        }
        return this;
    }
    public MyTime prviousHour(){
        if (this.hour > 0 && this.hour < 24) {
            this.hour--;
        } else this.hour = 23;
        return this;
    }
}
