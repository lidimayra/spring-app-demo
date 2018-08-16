package lt.iocdoiannotations.dependencyofinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScientificPaper implements Article {
    private Author author;

    @Autowired
    public void setBlogger(Researcher blogger) {
       this.author = blogger;
    }

    @Override
    public void displayContent() {
        System.out.println("An interesting research in here!");
    }

    @Override
    public void displayAuthorDescription() { author.displayDescription();
    }
}
