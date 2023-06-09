package ch15.generic;

// 다음과 같은 Box 클래스는 여러 가지 다양한 타입의 데이터를 저장할 수 있음
class Box {
    Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

// int(정수) 타입
class IntBox {
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

// String(문자열) 타입
class StrBox {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

/*
 * 어떤 클래스를 generic 클래스로 정의하는 것은 클래스 내부에서 사용할 데이터 타입을 미리 정해놓지 않겠다는 의미
 * 사용자가 이 클래스의 객체를 생성할 때, 어떤 타입을 사용할 지 결정하도록 하겠다는 의미
 * 즉, 사용할 데이터 타입을 파라미터로 받는다는 의미 => 타입 파라미터(Type Parameter)
 * 타입 파라미터는 대문자 한 글자로 표현하는 것이 관례이고 보통 T를 사용함
 */
public class Generic<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericBox<Integer> box1 = new GenericBox<Integer>();
        box1.setValue(100);
        // (!) 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아줌 
        // box1.setValue("동해물과 백두산이"); (X)
        int val = box1.getValue();
        System.out.println("박스에 저장된 값은 ["+ val + "]입니다."); // 박스에 저장된 값은 [100]입니다.


        GenericBox<String> box2 = new GenericBox<String>();
        box2.setValue("동해물과 백두산이 마르고 닳도록");
        // (!) 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아줌 
        // box2.setValue(200); (X)
        String sval = box2.getValue();
        System.out.println("박스에 저장된 값은 ["+ sval + "]입니다."); // 박스에 저장된 값은 [동해물과 백두산이 마르고 닳도록] 입니다.
    }
}

