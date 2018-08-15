package lt.iocdoiannotations.dependencyofinjection.constructor;

import org.springframework.stereotype.Component;

@Component
public class Blogger implements Author {

    @Override
    public void displayDescription() {
        System.out.println("This is a blog author!!");
    }
}
