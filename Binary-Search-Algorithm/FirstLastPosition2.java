// Q. Find first and last position of the elementin Sorted Array - (Optimal Solution).

import java.util.Arrays;

public class FirstLastPosition2 {
    public static int[] firstLastPosition(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int fp = -1;
        int lp = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                fp = mid;
                end = mid - 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        start = 0;
        end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                lp = mid;
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return new int[] {fp, lp};
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int[] ans = firstLastPosition(arr, 8);
        System.out.println(Arrays.toString(ans));
    }
}
