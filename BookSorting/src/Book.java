public class Book {

    private final String title;
    private final int pageCount;
    private final String authorName;
    private final String publicationDate;

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublicaationDate() {
        return publicationDate;
    }

    public Book(String title, int pageCount, String authorName, String publicaationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicaationDate;
    }

    @Override
    public String toString() {
        return title+", " + authorName +" (" + publicationDate +"), Page Count: " + pageCount;
    }

}
