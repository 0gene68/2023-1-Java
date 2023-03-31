package ch07.Animal2;

public class Animal2Test {
    public static void main(String[] args) {
        Animal2 a = new Animal2();
        Dog d = new Dog();
        Cat c = new Cat();

        Animal2 obj = a;
        obj.sound();

        obj = d;
        d.sound();

        obj = c;
        c.sound();
    }

}


