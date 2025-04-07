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
    }
}
