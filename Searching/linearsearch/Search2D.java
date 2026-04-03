public class Search2D {

    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 77;

        int[] result = search(arr, target);

        if(result[0] == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at: (" + result[0] + ", " + result[1] + ")");
        }
    }

    static int[] search(int[][] arr, int target) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] == target) {
                    return new int[]{i, j}; // row, col
                }
            }
        }

        return new int[]{-1, -1};
    }
}