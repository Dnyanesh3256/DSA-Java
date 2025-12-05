// Q. Find first and last position of the elementin Sorted Array - (Optimal Solution). (in a better way)

import java.util.Arrays;

public class FirstLastPosition3 {
    public static int[] firstLastPosition(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        int[] ans = {-1, -1};

        ans[0] = findPosition(arr, target, start, end, true);

        if(ans[0] != -1){
            ans[1] = findPosition(arr, target, start, end, false);
        }
            
        return ans;
    }

    public static int findPosition(int[] arr, int target, int start, int end, boolean fp){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                
                if(fp){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int[] ans = firstLastPosition(arr, 8);
        System.out.println(Arrays.toString(ans));
    }
}
