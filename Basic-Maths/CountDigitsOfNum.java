// Q. Count Digits. (GFG) (E)

public class CountDigitsOfNum{
    public static int countDigits(int n){
        int count = 0;

        while(n > 0){
            n /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 15603;
        System.out.println(countDigits(n));
    }
}