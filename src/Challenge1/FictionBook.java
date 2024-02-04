package Challenge1;

public class FictionBook extends Book {

    private String genre;

        public FictionBook(String title, String author,String isbn,String genre) {
            super(title, author,isbn);
            this.genre= genre;
        }

        public String getGenre(){
            return genre;
        }
    public void setgenre(String topic) {
        this.genre = topic;
    }
        @Override
        public void displayInfo() {
            System.out.println("Genre: "+ genre);
            super.displayInfo();
        }
    }



