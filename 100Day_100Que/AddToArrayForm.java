import java.util.*;

public class AddToArrayForm{
    public static void main(String[] args) {
        
        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> result = addToArrayForm(num, k);

        System.out.println( result);
    }

    static List<Integer> addToArrayForm(int[] num, int k){

        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        while(i >= 0 || k > 0){
            
            if(i >= 0){
                k = k + num[i]; //add current digit
                i--;
            }

            int digit = k % 10;
            result.add(digit); //store last digit

            k = k/10; //carry
        }

        Collections.reverse(result); //fix order

        return result;
    }
}