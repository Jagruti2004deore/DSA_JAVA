public class Palindromenumber {
    public static void main(String[] args) {
        int x = 121;

        boolean result = isPalindrome(x);

        System.out.println(result);
    }

     static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }

        int n = x;

        int revNum = 0;

        while(n > 0){
            int digit = n % 10;
            revNum = revNum * 10 + digit;
            n = n / 10;
             
        }

        return revNum == x;
     }

}
