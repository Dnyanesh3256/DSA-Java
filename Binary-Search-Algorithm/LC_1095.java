// Q. Find in Mountain Array. (Leetcode - 1095) (H)

public class LC_1095 {
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }

    public static int binarySearch(int arr[], int target, int start, int end){

        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static int findInMountainArray(int target, int[] arr) {
        int peak = findPeak(arr);
        int firstTry =  binarySearch(arr, target, 0, peak);

        if(firstTry != -1){
            return firstTry;
        }

        return binarySearch(arr, target, peak+1, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(findInMountainArray(2, arr));
    }
}
