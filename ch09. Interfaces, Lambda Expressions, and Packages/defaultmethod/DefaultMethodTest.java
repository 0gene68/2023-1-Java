package ch09.defaultmethod;

interface myInterFace {
    // 일반적인 추상 메소드
    // common abstract method 
    public void myMethod1();

    // 디폴트 메소드 : 인터페이스 내에서 메소드의 디폴트 구현을 제공할 수 있는 기능
    // Default method: the ability to provide a default implementation of a method within an interface
    default void myMethod2 () {
        System.out.println("myMethod2()");
    }
}

public class DefaultMethodTest implements myInterFace{

    @Override
    public void myMethod1() {
        System.out.println("myMethod1()");
    }
    
    public static void main(String[] args) {
        DefaultMethodTest obj = new DefaultMethodTest();

        obj.myMethod1(); //myMethod1()
        // 디폴트 메소드는 인터페이스를 구현하는 클래스에서 구현하지 않아도 바로 사용할 수 있다.
        // The default method can be used immediately without being implemented in the class that implements the interface.
        obj.myMethod2(); //myMethod2()
    }
}
