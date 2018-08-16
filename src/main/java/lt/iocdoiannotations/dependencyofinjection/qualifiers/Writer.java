package lt.iocdoiannotations.dependencyofinjection.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class Writer implements Author {

    @Override
    public void displayDescription() {
        System.out.println("This is a writer!!");
    }
}
