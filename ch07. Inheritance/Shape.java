package ch07;

public class Shape {

    /* 
     * The Shape class represents a general two-dimensional shape.
     * - int x and int y are the top left coordinates of the shape.
     * - In print(), the position of the figure is printed on the screen.
     * 
     * The Rectangle class is a subclass of the Shape class, and adds a number of methods along with the length and width of the rectangle.
     * - int width and int height are the width and height of the rectangle.
     * - In draw(), the position and size of the rectangle are displayed on the screen.
     * - Area() calculates and returns the area of a rectangle.
    */

    int x, y;

    public void print(){
        System.out.println("x coordinate : " + x + " y coordinate : " + y);
    }
}
