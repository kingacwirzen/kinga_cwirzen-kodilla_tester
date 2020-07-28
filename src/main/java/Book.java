public class Book {

    private static String author;
    private static String tittle;

    public Book(String author, String tittle) {
        this.author = author;
        this.tittle = tittle;
    }

    public static Book of(String author, String tittle) {
        Book book = new Book(author, tittle);
        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("J.Grzędowicz", "Wypychacz zwierząt");
    }

}
