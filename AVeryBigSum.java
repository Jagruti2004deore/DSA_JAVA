import java.util.*;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        long sum = 0;

        for(long num : ar){
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Long> numbers = new ArrayList<>();

        for(int i = 0; i < n; i++){
            numbers.add(sc.nextLong());
        }

        long result = aVeryBigSum(numbers);

        System.out.println(result);

        sc.close();
    }
}