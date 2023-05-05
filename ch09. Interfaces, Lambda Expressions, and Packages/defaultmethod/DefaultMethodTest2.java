package ch09.defaultmethod;

interface OperateCar {
// 디폴트 메소드
// 인터페이스 안에 생성되는 메소드 중 하나
// 해당 인터페이스를 구현하는 클래스에서 오버라이드하지 않아도 상속됨  
// 인터페이스의 메소드 선언 시 앞에 default 키워드를 붙여 생성함

// default method
// one of the methods created inside the interface
// Inherited even if the class implementing the interface does not override it
// When declaring an interface method, add the default keyword in front of it to create it.

    // 일반적인 인터페이스 메소드(common interface method)
    void start();
    void stop();
    void setSpeed(int speed);
    void turn(int degree);

    // 디폴트 메소드(default method)
    default public void fly() {
        System.out.println("Flying Sky!");
    } 
}

class OldCar implements OperateCar {
    // 디폴트 메소드를 구현하지 않았지만 디폴트 메소드가 상속됨 

    // Default method not implemented, but default method is inherited
    @Override
    public void start() {  }

    @Override
    public void stop() {  }

    @Override
    public void setSpeed(int speed) {  }

    @Override
    public void turn(int degree) {  }
} 

public class DefaultMethodTest2{
    public static void main(String[] args) {
        OldCar obj = new OldCar();
        obj.fly(); // Flying Sky!
    }
}
