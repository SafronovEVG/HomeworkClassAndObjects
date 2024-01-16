public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("Voina i mir", author, 1987);
        Author author1 = new Author("Alexandr", "Pushkin");
        Book book1 = new Book("Car Soltan", author1, 1786);

        System.out.println(book);
        author.setName("Ivav");
        System.out.println(book);
    }


}
