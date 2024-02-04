public class ArrayOperations {
    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5};
        System.out.println("Elements in the array: ");
        for (int number:numbers){
            System.out.println(number);
        }
        int sum= 0;
        for (int number: numbers){
          sum+=number;
        }  System.out.println("Sum of elements: "+sum);
        // Find and print the maximum and minimum values in the array
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        int searchNumber=8;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==searchNumber){
                System.out.println(searchNumber+ "found at index "+i);
                break;
            }
        }
        //Loop through the array in reverse order
        for (int i =numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);

        }











    }
}
