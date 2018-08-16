package lt.iocdoiannotations.dependencyofinjection.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class Reporter implements Author {

    @Override
    public void displayDescription() {
        System.out.println("This is a report author!!");
    }
}
