package lt.taquehara.inversionofcontrol;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
