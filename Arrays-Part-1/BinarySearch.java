public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        int res = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == target){
                res = mid;
                end = mid - 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 6, 8, 10, 12, 12, 14, 16, 18, 20};
        System.out.println(binarySearch(arr, 6));
    }
}
