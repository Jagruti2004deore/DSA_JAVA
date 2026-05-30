import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {

        int i = 0;

        
        // CYCLIC SORT
        
        while (i < nums.length) {

            // Find correct position of current number
            int correct = nums[i] - 1;

            // If number is not at its correct position,
            // place it there
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        
        // FIND DUPLICATE & MISSING
        
        for (int index = 0; index < nums.length; index++) {

            // If number is not at correct position
            if (nums[index] != index + 1) {

                // nums[index] = duplicate
                // index + 1 = missing
                return new int[]{nums[index], index + 1};
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}