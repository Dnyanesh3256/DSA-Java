// Q. Find first and last position of element in sorted array. (Leetcode - 34) (M)

import java.util.Arrays;

public class LC_34 {
    public static int search(int[] nums, int target, boolean isFirstPosition){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                if(isFirstPosition){
                    ans = mid;
                    end = mid - 1;
                }else{
                    ans = mid;
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public static int[] searchPositions(int[] nums, int target){
        int fp = search(nums, target, true);
        int lp = search(nums, target, false);

        return new int[] {fp, lp};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};

        int ans[] = searchPositions(nums, 8);

        System.out.println(Arrays.toString(ans));
    }
}
