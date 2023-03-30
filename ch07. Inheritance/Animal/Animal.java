package ch07;

public class Animal {

    /*
     * <Inheritance practice>
     * Assume the following inheritance hierarchy:
     * The Animal class becomes the parent class.
     * The Lion class and the Eagle class become child classes.
     * Subclasses can inherit the methods of the parent class, Animal class, and use them with their own methods.
     */

    protected double weight;
    protected String picture;

    public void eat(){
        System.out.println("eat() was called.");
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getPicture(){
        return picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }

    public void sleep(){
        System.out.println("sleep() was called.");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.roar();
        
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.sleep();
        eagle.fly();
    }
}
