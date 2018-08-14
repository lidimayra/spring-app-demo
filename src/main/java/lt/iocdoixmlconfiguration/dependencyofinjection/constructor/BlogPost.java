package lt.iocdoixmlconfiguration.dependencyofinjection.constructor;

public class BlogPost implements Article {
    private Blogger blogger;

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
