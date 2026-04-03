package searching.linearsearch;

public class SearchElementInArray {

    public static void main(String[] args) {
        int[] nums = {23, 24, 67, 87, 0, -8};
        int target = 80;

        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}