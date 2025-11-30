// Q. Find numbers with even number of digits in an array.

public class NumbersWithEvenDigits2 {
    public static int findNumbers(int arr[]){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            int len = Integer.toString(arr[i]).length();

            if(len%2 == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(arr));
    }
}
