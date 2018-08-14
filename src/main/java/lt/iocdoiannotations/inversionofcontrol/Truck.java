package lt.iocdoiannotations.inversionofcontrol;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle {

    @Override
    public void move() {
        System.out.println("Truck is moving!");
    }
}
