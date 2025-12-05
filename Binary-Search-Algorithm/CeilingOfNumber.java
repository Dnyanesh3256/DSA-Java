// Q. Finding Ceiling of a Number


// Ceiling of a number is a smallest number >= target
public class CeilingOfNumber {
    public static int ceilingNumber(int arr[], int target){
        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return arr[start];
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceilingNumber(arr, 19));
    }
}
