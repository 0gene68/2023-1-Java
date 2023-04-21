package ch09.Rectangle;

public class Rectangle implements Comparable{
    private int width;
    private int height;

    public int getArea() {
        return width * height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    @Override
    public int compareTo(Object other) {
        Rectangle r = (Rectangle) other;

        int area = width * height;
        int otherArea = r.getArea();
        if(area == otherArea) {
            return 0;
        } else if(area > otherArea) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
