package test;

public class Date {
    private int year;
    private String month;
    private int day;

    public Date(int y, String m, int d){
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public Date(int y){
        this(y, "January", 1);
    }

    public Date(){
        this(1900, "January", 1);
    }

    @Override
    public String toString(){
        return("Date [year=" + this.year + ", month=" + this.month + ", day=" + this.day + "]");
    }

    public static void main(String[] args){
        Date date1 = new Date(2015, "August", 10);
        Date date2 = new Date(2020);
        Date date3 = new Date();

        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());
    }
}
