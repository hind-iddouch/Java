package Challenge1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author =author;
        this.isbn =isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public String getisbn(){
        return isbn;
    }
    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void displayInfo(){
        System.out.println("title: "+getTitle());
        System.out.println("author "+getauthor());
        System.out.println("isbn "+getisbn());
    }
}



