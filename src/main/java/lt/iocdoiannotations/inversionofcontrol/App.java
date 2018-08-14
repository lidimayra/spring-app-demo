package lt.iocdoiannotations.inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");

        Vehicle vehicle = context.getBean("myCar", Vehicle.class);
        vehicle.move();

        context.close();
    }
}
