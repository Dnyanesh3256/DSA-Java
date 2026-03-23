// Q. Print linearly from 1 to N using Backtracking.

public class PrintLinearlyIncBacktrack {
    public static void print(int count, int n){
        if(count < 1){
            return;
        }

        print(count-1, n);

        System.out.println(count);
    }

    public static void main(String[] args) {
        print(10, 1);
    }
}
