package lt.taquehara.dependencyofinjection.constructor;

public class Blogger implements Author {

    @Override
    public void displayDescription() {
        System.out.println("This is a blog author!!");
    }
}
