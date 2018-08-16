package lt.iocdoiannotations.dependencyofinjection.method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Post implements Article {
    @Override
    @Autowired
    public void displayContent() {
        System.out.println("A nice post in here!");
    }
}
