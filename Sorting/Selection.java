import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {57, 84, 37, -22, 11};

        selection(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            // find last index of unsorted part
            int last = arr.length - i - 1;

            // find max element in range [0, last]
            int maxIndex = getMaxIndex(arr, 0, last);

            // swap max with last
            swap(arr, maxIndex, last);
        }
    }

    // function to find index of max element
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }

    // function to swap two elements
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}