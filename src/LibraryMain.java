/*public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library myLibrary = new Library();
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);

        myLibrary.displayBooks();
        myLibrary.findBooksByAuthor("Jane Doe");
    }
}
*/

public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

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
    }
}
