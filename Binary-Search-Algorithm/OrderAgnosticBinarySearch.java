// Q. Searching if element is present in sorted array or not (Order Agnostic Binary Search).

public class OrderAgnosticBinarySearch{
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

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

    public static void main(String[] args) {
        int arr[] = {45, 18, 15, 12, 10};
        System.out.println(binarySearch(arr, 18));

        System.out.println();

        int arr2[] = {10, 12, 15, 18, 45};
        System.out.println(binarySearch(arr2, 18));
    }
}