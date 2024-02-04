import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class FileNotFoundException{
    public static void main (String args[]){
        String filePath= "C:\\Users\\HP\\OneDrive\\Bureau\\Nouveau dossier";
        try {
            FileReader fileReader= new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }



    } catch (java.io.FileNotFoundException e) {
            System.err.println("Error:The specified file does not exist.");
        } catch (IOException e) {
         System.err.println("Error reading the file: "+e.getMessage());
        }
    }
}