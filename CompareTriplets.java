import java.util.*;

public class CompareTriplets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        // Input Alice scores
        for(int i = 0; i < 3; i++){
            a[i] = sc.nextInt();
        }

        // Input Bob scores
        for(int i = 0; i < 3; i++){
            b[i] = sc.nextInt();
        }

        int aliceScore = 0;
        int bobScore = 0;

        // Compare triplets
        for(int i = 0; i < 3; i++){

            if(a[i] > b[i]){
                aliceScore++;
            }
            else if(a[i] < b[i]){
                bobScore++;
            }

        }

        System.out.println(aliceScore + " " + bobScore);

        sc.close();
    }
}

// LOGIC
// Loop from 0 → 2
// Compare a[i] and b[i]

// if a[i] > b[i] → Alice++
// if a[i] < b[i] → Bob++

// Print scores