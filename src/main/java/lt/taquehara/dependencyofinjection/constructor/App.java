package lt.taquehara.dependencyofinjection.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Article article = context.getBean("myPost", Article.class);
        article.displayContent();
        article.displayAuthorDescription();

        context.close();
    }
}
