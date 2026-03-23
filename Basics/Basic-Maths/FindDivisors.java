// Q. All divisors of a Number. (GFG) (E)

import java.util.ArrayList;
import java.util.Collections;

public class FindDivisors {
    public static void printDivisorsBF(int n){
        for(int i=1; i<=n; i++){
            if((n % i) == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void printDivisorsOpt(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<=Math.sqrt(n); i++){
            if((n%i) == 0){
                list.add(i);
                
                if((n/i) != i){
                    list.add(n/i);
                } 
            }
        }

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        printDivisorsOpt(36);
    }   
}
