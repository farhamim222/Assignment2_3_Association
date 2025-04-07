public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Add rating & reviews
        b1.setRating(4.2);
        b1.addReview("Very helpful book for beginners.");
        b1.addReview("Well structured and clear examples.");

        b2.setRating(4.7);
        b2.addReview("Perfect for data structure understanding.");

        Library myLibrary = new Library();
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);

        myLibrary.displayBooks();
        myLibrary.findBooksByAuthor("Jane Doe");

        myLibrary.borrowBook("Data Structures and Algorithms");
        myLibrary.displayBooks();

        myLibrary.returnBook(b2);
        myLibrary.displayBooks();

        System.out.println("Is 'The Art of Fiction' available? " + myLibrary.isBookAvailable("The Art of Fiction"));
        System.out.println("Is 'Harry Potter' available? " + myLibrary.isBookAvailable("Harry Potter"));

        // Show ratings and reviews
        System.out.println("\nBook Ratings and Reviews:");
        System.out.println(b1.getTitle() + " - Rating: " + b1.getRating());
        for (String review : b1.getReviews()) {
            System.out.println("Review: " + review);
        }

        System.out.println(b2.getTitle() + " - Rating: " + b2.getRating());
        for (String review : b2.getReviews()) {
            System.out.println("Review: " + review);
        }

        // Task 5 – Library Statistics
        System.out.println("\nLibrary Statistics:");
        System.out.println("Average Rating: " + myLibrary.getAverageBookRating());

        Book mostReviewed = myLibrary.getMostReviewedBook();
        if (mostReviewed != null) {
            System.out.println("Most Reviewed Book: " + mostReviewed.getTitle());
            for (String review : mostReviewed.getReviews()) {
                System.out.println("Review: " + review);
            }
        } else {
            System.out.println("No reviews found.");
        }
    }
}
