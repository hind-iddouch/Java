package Challenge1;

import java.util.ArrayList;
public class Library {
            private ArrayList<Book> books;

            // Constructor
            public Library() {
                this.books = new ArrayList<>();
            }

            // Method to add a book to the library
            public void addBook(Book book) {
                books.add(book);
            }

            // Method to display information about all books in the library
            public void displayAllBooks() {
                System.out.println("Library Books:");
                for (Book book : books) {
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getauthor());
                    System.out.println("ISBN: " + book.getisbn());

                    // Check if the book is FictionBook or NonFictionBook and display specific information
                    if (book instanceof FictionBook) {
                        System.out.println("Genre: " + ((FictionBook) book).getGenre());
                    } else if (book instanceof NonFictionBook) {
                        System.out.println("subject: " + ((NonFictionBook) book).getSubject());
                    }

                    System.out.println("---------------");
                }
            }
        }










