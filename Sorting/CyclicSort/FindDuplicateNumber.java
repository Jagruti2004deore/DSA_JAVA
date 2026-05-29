public class FindDuplicateNumber {

    public static void main(String[] args) {

        // Input array
        int[] arr = {4, 1, 2, 1, 6, 5};

        // Print duplicate number
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {

        // Start from first index
        int i = 0;

        // Traverse array
        while (i < arr.length) {

            // Check whether current number is already
            // at its correct position
            if (arr[i] != i + 1) {

                // Calculate correct index
                // Example:
                // value 1 -> index 0
                // value 2 -> index 1
                // value 3 -> index 2
                int correct = arr[i] - 1;

                // If current value is not present
                // at its correct position
                if (arr[i] != arr[correct]) {

                    // Put number in correct position
                    swap(arr, i, correct);

                } else {

                    // Duplicate found
                    // Because same value already exists
                    // at its correct position
                    return arr[i];
                }

            } else {

                // Number already in correct place
                // Move to next index
                i++;
            }
        }

        // No duplicate found
        return -1;
    }

    static void swap(int[] arr, int first, int second) {

        // Normal swapping logic
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}