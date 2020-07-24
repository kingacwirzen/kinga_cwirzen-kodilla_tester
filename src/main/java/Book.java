public class Book {

    private static String author;
    private static String tittle;

    public Book(String author, String tittle) {
        this.author = author;
        this.tittle = tittle;
    }

    private void of() {
        System.out.println("Autor to " + author + " tytuł to " + tittle);
    }

    public static void main(String[] args) {
        Book book = new Book("J. Grzędowicz", "Wypychacz zwierząt");
        book.of();
    }

}
