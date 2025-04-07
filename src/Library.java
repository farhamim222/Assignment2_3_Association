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
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }

    public boolean borrowBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                books.remove(b);
                System.out.println("Book \"" + title + "\" has been borrowed.");
                return true;
            }
        }
        System.out.println("Book \"" + title + "\" is not available.");
        return false;
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" has been returned.");
    }

    public boolean isBookAvailable(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        double totalRating = 0.0;
        int ratedBooks = 0;

        for (Book b : books) {
            if (b.getRating() > 0) {
                totalRating += b.getRating();
                ratedBooks++;
            }
        }

        if (ratedBooks == 0) {
            return 0.0;
        }
        return totalRating / ratedBooks;
    }

    public Book getMostReviewedBook() {
        Book mostReviewed = null;
        int maxReviews = 0;

        for (Book b : books) {
            if (b.getReviews().size() > maxReviews) {
                maxReviews = b.getReviews().size();
                mostReviewed = b;
            }
        }

        return mostReviewed;
    }
}

