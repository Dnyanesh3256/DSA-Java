// Q. Prime Number. (GFG) (E)

public class PrimeNumber {
    public static boolean isPrimeBF(int n){
        if(n <= 1){
            return false;
        }

        int count = 0;
        for(int i=1; i<=n; i++){
            if((n%i) == 0){
                count++;
            }

            if(count > 2){
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeOpt(int n){
        if(n <= 1){
            return false;
        }

        int count = 0;

        for(int i=1; i*i<=n; i++){
            if((n%i) == 0){
                count++;

                if((n/i) != i){
                    count++;
                }
            }

            if(count > 2){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeOpt(111));
    }
}
