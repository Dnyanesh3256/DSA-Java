// Q. Rotation Count in a Rotated Sorted array

public class RotationCount {
    public static int countRotations(int[] arr){
        int pivot = findPivot(arr);

        if(pivot != -1){
            return pivot + 1;
        }else{
            return 0;
        }
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if((mid < end) && (arr[mid] > arr[mid + 1])){
                return mid;
            }

            if((mid > start) && (arr[mid] < arr[mid - 1])){
                return mid - 1;
            }

            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 3, 4};
        System.out.println(countRotations(arr));
    }
}
