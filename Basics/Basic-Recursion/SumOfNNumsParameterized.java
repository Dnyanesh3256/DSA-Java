// Q. Sum of First N Numbers.

public class SumOfNNumsParameterized {
    public static void sum(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }

        sum(n-1, sum+n);
    }

    public static void main(String[] args) {
        sum(2, 0);
    }
}