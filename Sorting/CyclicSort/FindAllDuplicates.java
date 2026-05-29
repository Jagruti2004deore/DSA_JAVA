import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {

        // Input array
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // Print all duplicate numbers
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {

        // Start from first index
        int i = 0;

        // ---------------------------
        // CYCLIC SORT
        // ---------------------------
        while (i < nums.length) {

            // Find where current number should be placed
            // Example:
            // value 1 -> index 0
            // value 2 -> index 1
            // value 3 -> index 2
            int correct = nums[i] - 1;

            // If current number is not at its correct position,
            // place it there by swapping
            if (nums[i] != nums[correct]) {

                swap(nums, i, correct);

            } else {

                // Number is already at correct position
                // OR duplicate prevents further swapping
                i++;
            }
        }

        // After cyclic sort:
        // Correct array should look like:
        // [1,2,3,4,5,6,7,8]
        //
        // If any position contains wrong value,
        // that value is a duplicate.

        List<Integer> duplicates = new ArrayList<>();

        // Check every index
        for (int index = 0; index < nums.length; index++) {

            // Expected value at this index
            int expected = index + 1;

            // If value is not at correct position
            if (nums[index] != expected) {

                // Current value is duplicate
                duplicates.add(nums[index]);
            }
        }

        return duplicates;
    }

    static void swap(int[] arr, int first, int second) {

        // Store first value temporarily
        int temp = arr[first];

        // Move second value to first position
        arr[first] = arr[second];

        // Put temp value into second position
        arr[second] = temp;
    }
}