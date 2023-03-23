package ch07;

public class Rectangle extends Shape{
    private int width;
    private int height;

    {
        width = 10;
        height = 20;
    }

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double area() {
        return width * height;
    }
    
    public void draw(){
        System.out.println("(" + x + "," + y + ") 위치에 가로 : " + width + " 세로: " + height);
    }

    public static void main(String[] args) {
        Rectangle rt1 = new Rectangle(5, 3);
        rt1.print();
        rt1.draw();
        
        Rectangle rt2 = new Rectangle(8, 9);
        rt2.print();
        rt2.draw();
    }
}
