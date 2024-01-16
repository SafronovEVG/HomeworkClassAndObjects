public class Tast extends Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("Voina i mir", author, 1987);
        getInfo(author,book);
        author.setName("Alexandr");
        author.setSurname("Puskin");
        book.setTitle("Sbornik stihov");
        book.setYearBookRelease(1777);
        getInfo(author,book);
    }
}
