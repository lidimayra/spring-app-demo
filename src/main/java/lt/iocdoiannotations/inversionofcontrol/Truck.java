package lt.iocdoiannotations.inversionofcontrol;

public class Truck implements Vehicle {

    @Override
    public void move() {
        System.out.println("Truck is moving!");
    }
}
