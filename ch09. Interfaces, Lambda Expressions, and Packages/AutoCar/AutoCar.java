package ch09.Autocar;

public class AutoCar implements OperateCar {

    @Override
    public void start() {
        System.out.println("The Car goes.");
    }

    @Override
    public void stop() {
        System.out.println("The Car stops.");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("The car changes speed to " + speed + "km/h.");
    }

    @Override
    public void turn(int degree) {
        System.out.println("The car changes direction by " + degree + " degrees.");
    }
    
}
