package lt.iocdoiannotations.dependencyofinjection.field;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");


        Article article = context.getBean("review", Article.class);
        article.displayContent();
        article.displayAuthorDescription();

        context.close();
    }
}
