public class CustomException {
public static void main (String args[]){
    try {
        validateInput(5);
    } catch (MyCustomException mce) {
        System.err.println("CustomException caught: "+mce.getMessage());
    }

    
    

}
    // Method that throws a custom exception
    private static void validateInput(int i) throws MyCustomException{
    if (i<10){
        throw new MyCustomException("Input must be grater than or equal 10");
    }else{
        System.err.println("Input is valid");
    }
    }
}
class MyCustomException extends Exception{
   public MyCustomException(String message){
       super(message);

   }
}

