package ch09.Rectangle;

public class Test {
    public static void findLarger(Comparable c1, Comparable c2){
        if(c1.compareTo(c2) == 0) {
            System.out.println("Area is the same.");
        } else if(c1.compareTo(c2) > 0) {
            System.out.println(c1 + " is bigger.");
        } else {
            System.out.println(c2 + " is bigger.");
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(100, 30);
        System.out.println(r1);
        Rectangle r2 = new Rectangle(200, 10);
        System.out.println(r2);

        findLarger(r1, r2);
    }
}
