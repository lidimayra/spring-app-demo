package lt.iocdoiannotations.dependencyofinjection.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");


        Article article = context.getBean("scientificPaper", Article.class);
        article.displayContent();
        article.displayAuthorDescription();

        context.close();
    }
}
