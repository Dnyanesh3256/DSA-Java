// Q. Print name 5 times.

public class PrintNTimes {
    public static int printNum(int n){
        if(n == 0){
            return n;
        }

        System.out.println("John Doe");

        return printNum(n-1);
    }

    public static void main(String[] args) {
        printNum(5);
    }
}