package lt.iocdoiannotations.dependencyofinjection.field;

import org.springframework.stereotype.Component;

@Component
public class Reviewer implements Author {

    @Override
    public void displayDescription() {
        System.out.println("This is a review author!!");
    }
}
