package lt.iocdoiannotations.dependencyofinjection.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Report implements Article {
    @Autowired
    @Qualifier("reporter")
    private Author author;

    @Override
    public void displayContent() {
        System.out.println("An astonishing report in here!");
    }

    @Override
    public void displayAuthorDescription() {
        author.displayDescription();
    }
}
