import javax.management.InvalidAttributeValueException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UserInputValidation extends Throwable {
    public static void main(String args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            int inputnum;
            do {
                System.out.println("Enter a positive integer: ");
                inputnum = scanner.nextInt();

            } while (inputnum < 0);
        }catch (InputMismatchException e){
            System.out.println("An exception is occurred at the input "+e.getMessage());
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }

    }
}








