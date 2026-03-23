// Q. Print linearly from N to 1 using Backtracking.

public class PrintLinearlyDecBacktrack {
    public static void print(int count, int n){
        if(count > n){
            return;
        }

        print(count+1, n);

        System.out.println(count);
    }

    public static void main(String[] args) {
        print(1, 10);
    }
}
