package Challenge1;

public class MainBook {
    public static void main(String[] args) {


        FictionBook fictionBook = new FictionBook("The Great Gatsby","F. Scott Fitzgerald","978-3-16-148410-0","Classic");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", "978-0-99-327810-8", "History");
        Book book = new Book("Data Structure Using C","Sharad Kumar Verma","978-93-5163-389-");

        Library library= new Library();


        // Add books to the library
        library.addBook(fictionBook);
        library.addBook(nonFictionBook);
        library.addBook(book);

        // Display information about all books in the library
        library.displayAllBooks();




    }
}