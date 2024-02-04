import java.util.*;

public class LinkedListOperations {

    public static void main(String args[]){

        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("Orange");
        linkedList.add("Apple");
        linkedList.add("Banana");
        System.out.println("LinkedList elements: "+linkedList);
        // Remove a node from the linked list (e.g., remove "Apple")
        linkedList.remove("Apple");
        // Print all elements of the linked list after removal
        System.out.println("LinkedList elements after removal: "+linkedList);
        // Find and print the length of the linked list
        System.out.println("Length of the linked list: " +linkedList.size());
        //Reverse the linked list.
        Collections.reverse(linkedList);
        // Print all elements of the reversed linked list
        System.out.println("Reversed LinkedList elements: " + linkedList);


    }




}
