import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int searchElement = 11;

        int result = binarySearch(sortedArray, searchElement);

        if (result != -1) {
            System.out.println("Element " + searchElement + " found at index: " + result);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid; // Element found, return index
            } else if (array[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found in the array
    }
}
