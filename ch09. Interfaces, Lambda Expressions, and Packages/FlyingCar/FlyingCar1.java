interface Drivable{
    void drive();
}

interface Flyable {
    void fly();
}

// 한 개의 클래스가 여러 개의 인터페이스를 동시에 구현하여 다중 상속의 효과를 낸다.
// One class implements several interfaces at the same time, resulting in multiple inheritance.
public class FlyingCar1 implements Drivable, Flyable{ 
    public void drive(){
        System.out.println("I'm driving!");
    }

    public void fly(){
        System.out.println("I'm flying!");
    }
    
    public static void main(String[] args){
        FlyingCar1 obj = new FlyingCar1();
        obj.drive(); // I'm driving!
        obj.fly(); // I'm flying!
    }
}