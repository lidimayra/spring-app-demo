package lt.iocdoiannotations.dependencyofinjection.setter;

import org.springframework.stereotype.Component;

@Component
public class Researcher implements Author {

    @Override
    public void displayDescription() {
        System.out.println("This is a Scientific Paper author!!");
    }
}
