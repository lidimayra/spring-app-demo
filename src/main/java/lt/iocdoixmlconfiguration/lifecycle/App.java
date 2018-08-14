package lt.iocdoixmlconfiguration.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");

        Vehicle vehicle = context.getBean("myCar", Vehicle.class);

        context.close();
    }
}
