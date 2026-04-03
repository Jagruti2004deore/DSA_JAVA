public class MinValue {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 2, 8};

        int min = findMin(arr);

        System.out.println("Minimum value: " + min);
    }

    static int findMin(int[] arr) {
        if (arr.length == 0) {
            return -1; // edge case
        }

        int min = arr[0]; // assume first element is minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}