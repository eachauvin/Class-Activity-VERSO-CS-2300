import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Class designed for removing duplicates from a given List
public class remove_duplicates {

    // Takes in a populated list of integers and an empty one, and returns another loist which has no duplicates
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        List<Integer> uniqueArr = new ArrayList<>();
        // For each item in the populated list
        for (int i = 0; i < arr.size(); i++) {
            // If it is not already in the uniqueArr list, add it
            if (!uniqueArr.contains(arr.get(i))) {
                uniqueArr.add(arr.get(i));
            } else {
                // Otherwise, add it to the list of removed elements to keep track of
                removedElements.add(arr.get(i));
            }
        }
        // Return the list of unique elements
        return uniqueArr;
    }

    // Main Function
    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);

        // Display Results
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
