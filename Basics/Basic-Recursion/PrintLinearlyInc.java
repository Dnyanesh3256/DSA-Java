// Q. Print linearly from 1 to N.

public class PrintLinearlyInc {
    public static void print(int count, int n){
        if(count > n){
            return;
        }

        System.out.println(count);
        
        print(count+1, n);
    }

    public static void main(String[] args) {
        print(1,10);
    }
}
