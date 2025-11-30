// Q. Find numbers with even number of digits in an array.

public class NumbersWithEvenDigits1 {
    public static int findNumbers(int arr[]){
        int count = 0;

        for(int ele : arr){
            if(isEven(ele)){
                count++;
            }
        }

        return count;
    }

    public static boolean isEven(int num){
        int digits = digitCount(num);

        if(digits%2 == 0){
            return true;
        }

        return false;
    }

    public static int digitCount(int num){
        int count = 0;
        
        while(num > 0){
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(arr));
    }
}
