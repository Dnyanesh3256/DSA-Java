// Q. Reverse Digits. (GFG) (E)

public class ReverseDigitsOfNum {
    public static int reverseDigits(int n){
        int res = 0;

        while(n > 0){
            int ld = n % 10;
            res = res*10 + ld;
            n /= 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 11215;
        System.out.println(reverseDigits(n));
    }
}
