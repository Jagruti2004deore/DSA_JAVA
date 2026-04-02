import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        for(int i = 0; i < q; i++){

            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int idx = (x ^ lastAnswer) % n;

            if(type == 1){
                arr.get(idx).add(y);
            }
            else{

                List<Integer> seq = arr.get(idx);
                lastAnswer = seq.get(y % seq.size());

                System.out.println(lastAnswer);
            }
        }

        sc.close();
    }
}