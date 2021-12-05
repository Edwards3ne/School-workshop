package BlogPost;

public class BlogPost {
    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
