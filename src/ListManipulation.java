import java.util.ArrayList;

public class ListManipulation {
public static void main(String args[]){
    ArrayList<String> str=new ArrayList<>();
    str.add("Steve");
    str.add("Tim");
    str.add("Lucy");
    System.out.println("ArrayList: ");
    for (String array:str){
        System.out.println(array);
    }
    str.add(3,"Tom");
     System.out.println(str);

     str.remove("Steve");
    System.out.println(str);

    // Check if a specific element exists in the ArrayList
    String searchElement = "Tom";
    if (str.contains(searchElement)) {
        System.out.println(searchElement + " exists in the ArrayList.");
    } else {
        System.out.println(searchElement + " does not exist in the ArrayList.");
    }
}}
