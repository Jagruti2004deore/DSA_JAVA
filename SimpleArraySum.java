import java.util.*;

public class SimpleArraySum {

    public static int simpleArraySum(int[] arr) {
        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = simpleArraySum(arr);

        System.out.println(result);

        sc.close();
    }
}