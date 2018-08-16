package lt.iocdoiannotations.dependencyofinjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Review implements Article {
    @Autowired
    private Author author;

    @Override
    public void displayContent() {
        System.out.println("A nice review in here!");
    }

    @Override
    public void displayAuthorDescription() {
        author.displayDescription();
    }
}
