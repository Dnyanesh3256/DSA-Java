// Q. Palindrome Number. (GFG) (E)

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int cp = n;
        int res = 0;

        while(cp > 0){
            int ld = cp % 10;
            res = res * 10 + ld;
            cp /= 10;
        }

        return (res == n);
    }

    public static void main(String[] args) {
        int n = 1211;
        System.out.println(isPalindrome(n));
    }
}
