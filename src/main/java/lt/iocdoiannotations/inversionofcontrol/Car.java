package lt.iocdoiannotations.inversionofcontrol;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
