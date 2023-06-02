class IntBox {
    // 기초 자료형 int의 Wrapper Class
    private Integer value;

    public Integer getValue() {
        // value = 3; // 자동으로 int 값을 Integer 값으로 변환, Auto Boxing
        // int v = value; // 자동으로 Integer 값을 int 값으로 변환, Auto Unboxing
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

class StrBox {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Box {
    Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

public class LambdaTest {
    public static void main(String[] args) {
        // int
        IntBox ib1 = new IntBox();
        ib1.setValue(10);
        System.out.println(ib1.getValue());

        IntBox ib2 = new IntBox();
        ib2.setValue(20);

        int intResult = ib1.getValue() + ib2.getValue();
        System.out.println(result); */

        // String
        StrBox sb1 = new StrBox();
        sb1.setValue("동해물과 ");

        StrBox sb2 = new StrBox();
        sb2.setValue("백두산이");

        String stringResult = sb1.getValue() + sb2.getValue();
        System.out.println(result);
        
        int idx = result.indexOf("백두산이");
        System.out.println(idx);
        System.out.println(result.substring(idx));

        // Object
        Box b1 = new Box();
        b1.setValue(20);

        Box b2 = new Box();
        b2.setValue(30);

        int objectResult = (int)b1.getValue() + (int)b2.getValue();
        System.out.println(result);

        Box strBox = new Box();
        strBox.setValue("마르고 닳도록 하느님이 보우하사 우리나라 만세!");
        Object v = strBox.getValue();
        int idx = ((String)v).indexOf("우리나라");
        System.out.println(((String)v).substring(idx));

        Integer val = (int)strBox.getValue();
        System.out.println(val);
    }
}
