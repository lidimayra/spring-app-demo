package lt.taquehara.inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Vehicle vehicle = context.getBean("myTruck", Vehicle.class);
        vehicle.move();

        context.close();
    }
}
