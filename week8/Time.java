package week8911.week8;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        int hour1 = Integer.parseInt(String.format("%02d", hour));
        int minute1 = Integer.parseInt(String.format("%02d", minute));
        int second1 = Integer.parseInt(String.format("%02d", second));
        return hour1 + ":" + minute1 + ":" + second1;
    }
    public Time nextSecond() {
        if (this.second < 59) {
            this.second++;
        } else {
            this.second = 0;
            if(this.minute<59){
                this.minute++;
            }else {
                this.minute=0;
                if (this.hour<23){
                    this.hour++;
                }else this.hour=0;
            }
        }
        return this;
    }
    public Time previousSecond() {
        this.second--;
        if (this.second < 0) {
            this.second = 59;
            --this.minute;
            if (this.minute < 0) {
                this.minute = 59;
                --this.hour;
                if (this.hour < 0) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}
