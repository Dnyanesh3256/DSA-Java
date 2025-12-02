// Q. Searching if element is present in sorted an array or not (Binary Search).

public class BinarySearch{
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + ((end - start)/2);

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 15, 18, 45};
        System.out.println(binarySearch(arr, 18));
    }
}