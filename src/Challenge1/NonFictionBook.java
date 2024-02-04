package Challenge1;

public class NonFictionBook extends Book{

    private String subject;
    public NonFictionBook(String title, String author,String isbn,String subject) {
        super(title,author,isbn);
        this.subject=subject;
    }

    public String getSubject(){
        return subject;
    }
    // Override method for polymorphism
    @Override
    public void displayInfo() {
        System.out.println("Subject: "+ subject);
        super.displayInfo();

    }


}
