import java.util.*;

public class StackImplementation {
public static void main(String args[]){

Stack<String>stack=new Stack<>();
    //adds the element in the stack
   stack.push("Ajeet");
   stack.push("Hari");
   stack.push("Tom");
   System.out.println(stack);
    //Check if the stack is empty and print the result
    stack.pop();
  if (stack.empty()){
      System.out.println("Stack is empty.");
  }else {
      System.out.println("Stack is not empty.");
  }
    //the element at the top of the stack
    System.out.println("the element at the top of the stack is: "+stack.peek());

    // Displaying the Stack after the Operation
    System.out.println("Final Stack: " + stack);
}


}
