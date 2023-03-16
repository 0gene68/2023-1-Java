public class Car {
    String color; //자동차의 색상
    int gear; //자동차의 현재 기어
    int speed; //자동차의 현재 속도
    double fuelEfficiency; //자동차의 연비

    //객체의 상태를 toString() 메소드를 사용해 출력
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + ", Fuel Efficiency=" + fuelEfficiency + "]";
    }

    //자동차의 기어를 바꿈
    void changeGear(int g){
        gear = g;
    }

    //자동차의 속도를 올림
    void speedUp(){
        speed += 5;
    }

    //자동차의 속도를 내림
    void speedDown(){
        speed -= 5;
    }

    //자동차가 지정된 거리(100km로 지정)를 주행하는 데 필요한 연료의 양을 계산하는 메소드 추가
    public double fuel(){
        return fuelEfficiency / 100;
    }

    public static void main(String[] args){
        //객체 생성
        Car myCar = new Car();

        myCar.changeGear(1); //myCar의 기어를 1단으로 변경
        myCar.speedUp(); //myCar의 속력을 올림
        myCar.fuelEfficiency = 8.3; // 자동차의 연비 설정
        System.out.println(myCar); //자동차 객체의 상태 출력


        //자동차가 100km를 가는 데에 필요한 연료의 양 출력
        System.out.println("A car needs " + myCar.fuel() + " liters of fuel to travel 100 km.");
    }
}
