public class Book {
    private String title;
    private int yearBookRelease;
  private Author author;

    public Book() {

    }

    public Book(String title, Author author, int yearBookRelease) {
        this.title = title;
        this.yearBookRelease = yearBookRelease;
        this.author = author;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearBookRelease() {
        return this.yearBookRelease;
    }

    public void setYearBookRelease(int year) {
        this.yearBookRelease = year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearBookRelease=" + yearBookRelease +
                ", author=" + author +
                '}';
    }
}
