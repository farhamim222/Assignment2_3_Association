import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        int count = 1;
        System.out.println("Library Catalog:");
        for (Book b : books) {
            System.out.println(count++ + ". Title: \"" + b.getTitle() + "\", Author: \"" + b.getAuthor() + "\", Year: " + b.getYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author \"" + author + "\":");
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }
}
