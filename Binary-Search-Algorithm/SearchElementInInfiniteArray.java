// Q. Find position of an element in a sorted array of infinite numbers.

public class SearchElementInInfiniteArray {
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

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

    public static int searchInfiniteArray(int arr[], int target){
        int start = 0;
        int end = 1;

        while(arr[end] < target){
            int newStart = end + 1;
            end = (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(searchInfiniteArray(arr, 10));
    }
}
