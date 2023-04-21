package ch09.Autocar;

public class AutoCarTest {
    public static void main(String[] args) {
        AutoCar ac = new AutoCar();
        ac.start(); // The Car goes.
        ac.setSpeed(30); // The car changes speed to 30km/h.
        ac.turn(15); // The car changes direction by 15 degrees.
        ac.stop(); // The Car stops.
    }
}
