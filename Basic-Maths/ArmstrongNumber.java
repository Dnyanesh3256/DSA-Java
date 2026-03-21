// Q. Armstrong Number. (GFG) (E)

public class ArmstrongNumber {
    public static boolean isArmstrong(int n){
        int cp = n;
        int sum = 0;

        while(cp > 0){
            int ld = cp % 10;
            sum += ld * ld * ld;
            cp /= 10;
        }

        return (sum == n);
    }

    public static void main(String[] args) {
        int n = 1634;
        System.out.println(isArmstrong(n));
    }    
}
