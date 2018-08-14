package lt.iocdoixmlconfiguration.dependencyofinjection.setter;

public class BlogPost implements Article {
    private Author author;
    private String title;

    public void setBlogger(Author author) {
        this.author = author;
    }

    @Override
    public void displayContent() {
        System.out.println("A nice post in here!");
    }

    @Override
    public void displayAuthorDescription() {
        author.displayDescription();
    }

    @Override
    public void setTitle(String title) {
       this.title = title;
    }

    @Override
    public String getTitle() {
       return title;
    }
}
