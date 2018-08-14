package lt.iocdoixmlconfiguration.lifecycle;

public class Car implements Vehicle {
    @Override
    public void turnOn() {
        System.out.println("< Turning the car on!! >");
    }

    @Override
    public void turnOff() {
        System.out.println("< Turning the car off!! >");
    }
}
