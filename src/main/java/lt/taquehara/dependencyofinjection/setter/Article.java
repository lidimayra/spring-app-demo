package lt.taquehara.dependencyofinjection.setter;

public interface Article {
    public void displayContent();
    public void displayAuthorDescription();
    public void setTitle(String title);
    public String getTitle();
}
