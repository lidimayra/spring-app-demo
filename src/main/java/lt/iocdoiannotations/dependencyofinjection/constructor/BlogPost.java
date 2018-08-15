package lt.iocdoiannotations.dependencyofinjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BlogPost implements Article {
    private Blogger blogger;

    @Autowired
    public BlogPost(Blogger blogger) {
        this.blogger = blogger;
    }

    @Override
    public void displayContent() {
        System.out.println("A nice post in here!");
    }

    @Override
    public void displayAuthorDescription() {
        blogger.displayDescription();
    }
}
