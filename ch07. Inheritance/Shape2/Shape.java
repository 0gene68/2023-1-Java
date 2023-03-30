package ch07.Shape2;

public class Shape {
    /*
     * Shape is the parent class of Rectangle, and Rectangle is the parent class of ColoredRectangle.
     * In this case, ColoredRectangle inherits all members of Shape and Rectangle.
     * Assume an inheritance hierarchy consisting of Shape → Rectangle → ColoredRectangle.
     * Experiment with the order in which the constructors of each class are called.
     */
    private int x;
    private int y;

    public Shape(int x, int y){
        System.out.println("Shape()");
        this.x = x;
        this.y = y;
    }
}
