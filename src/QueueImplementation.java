import java.util.*;
public class QueueImplementation {
    public static void main(String args[]){

        Queue<String>queue=new LinkedList<>();
        queue.add("Tom");
        queue.add("Maggie");
        queue.add("Rick");
        System.out.println("Elements in Queue: "+queue);
        //remove the element from the queue
        System.out.println("Removed element: "+queue.remove());
        //peek
        System.out.println("peek(): "+queue.peek());
        //Check if the queue is empty.
        if (queue.isEmpty()){
            System.out.println("Queue is empty");
        }else {
            System.out.println("Queue is not empty");
        }
        // Displaying the Stack after the Operation
        System.out.println("Final Queue: " + queue);




    }




}
