// Q. Find first and last position of the elementin Sorted Array - (Brute Force).

import java.util.Arrays;

public class FirstLastPosition1 {
    public static int[] firstLastPosition(int arr[], int target){
        int fp = -1;
        int lp = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                fp = i;
                break;
            }
        }

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == target){
                lp = i;
                break;
            }
        }

        return new int[] {fp, lp};
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int[] ans = firstLastPosition(arr, 7);
        System.out.println(Arrays.toString(ans));
    }
}