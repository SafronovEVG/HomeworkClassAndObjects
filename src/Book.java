public class Book {
    private  String title;
    private int yearBookRelease;
       public Book(String title, Author author, int yearBookRelease) {
        this.title = title;
        this.yearBookRelease = yearBookRelease;

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
}
