// Q. Searching if element is present in sorted array (descending order) or not (Binary Search).

public class BinarySearch2 {
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {45, 18, 15, 12, 10};
        System.out.println(binarySearch(arr, 18));
    }
}
