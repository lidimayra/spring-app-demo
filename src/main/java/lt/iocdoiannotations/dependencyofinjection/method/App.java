package lt.iocdoiannotations.dependencyofinjection.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");


        context.getBean("post", Article.class);
        context.close();
    }
}
