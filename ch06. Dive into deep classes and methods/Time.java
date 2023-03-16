package test;

public class Time {
    private int hour; // 0 ~ 23 
    private int minute; // 0 ~ 59
    private int second; // 0 ~ 59

    public Time(){
        this(0, 0, 0);    
    }

    public Time(int hour, int minute, int second){
        this.hour = ((hour >= 0 && hour < 24) ? hour : 0);
        this.minute = ((minute >= 0 && minute < 60) ? minute : 0);
        this.second = ((second >= 0 && second < 60) ? second : 0);
    }
    
    public String toString(){
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }

    public static void main(String[] args){
        Time time1 = new Time();
        System.out.println("Time after calling the default constructor: " + time1.toString());
        
        Time time2 = new Time(1, 1, 1);
        System.out.println("Time after second constructor call: " + time2.toString());

        Time time3 = new Time(24, 60, 60);
        System.out.println("Time after incorrect time settingS : " + time3.toString());

    }
}
