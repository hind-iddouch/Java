import java.util.Scanner;

import static java.time.InstantSource.system;

class NumberFormatException{
    public static void main(String arg[]){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
       String userInput= scanner.nextLine();
       try {
           int num= Integer.parseInt(userInput);
           System.out.println("You entered a valid integer: "+num);

       } catch (java.lang.NumberFormatException e) {
          System.out.println("Number format exception occurred");
       }

    }


}
