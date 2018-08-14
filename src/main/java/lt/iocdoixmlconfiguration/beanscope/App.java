package lt.iocdoixmlconfiguration.beanscope;

import lt.iocdoixmlconfiguration.beanscope.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

        Vehicle vehicle_1 = context.getBean("singletonCar", Vehicle.class);
        Vehicle vehicle_2 = context.getBean("singletonCar", Vehicle.class);
        boolean result = vehicle_1 == vehicle_2;

        System.out.println("=====");
        System.out.printf("Same object: %s\n", result);
        System.out.println(vehicle_1);
        System.out.println(vehicle_2);
        System.out.println("=====");

        vehicle_1 = context.getBean("prototypeCar", Vehicle.class);
        vehicle_2 = context.getBean("prototypeCar", Vehicle.class);
        result = vehicle_1 == vehicle_2;

        System.out.println("=====");
        System.out.printf("Same object: %s\n", result);
        System.out.println(vehicle_1);
        System.out.println(vehicle_2);
        System.out.println("=====");

        context.close();
    }
}
