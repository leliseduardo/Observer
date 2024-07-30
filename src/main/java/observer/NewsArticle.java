package observer;

public class NewsArticle {

    private String title;
    private String publicationDate;
    private Theme theme;

    public NewsArticle(String title, String publicationDate, Theme theme) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.theme = theme;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public Theme getTheme() {
        return theme;
    }

}

