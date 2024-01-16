public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("Voina i mir", author, 1987);
        Author author1 = new Author("Alexandr", "Pushkin");
        Book book1 = new Book("Car Soltan", author1, 1786);
        getInfo(author, book);
        getInfo(author1,book1);
    }

    public static void getInfo(Author author, Book book) {
        System.out.println("книга - " + book.getTitle() + " Год выпуска - " + book.getYearBookRelease() + " Автор - " + author.getName() + " " + author.getSurname());
    }

}
