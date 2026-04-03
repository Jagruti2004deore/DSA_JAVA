public class EvenDigits {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};

        int result = countEvenDigits(arr);

        System.out.println(result);
    }

    static int countEvenDigits(int[] arr) {
        int count = 0;

        for (int num : arr) {
            int digits = countDigits(num);

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int countDigits(int num) {
        if (num < 0) num = -num;

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}