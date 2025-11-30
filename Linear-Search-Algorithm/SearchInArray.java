// Q. Searching if element is present in an array or not.

public class SearchInArray {
    public static boolean searchArr(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {25, 30, 65, 89, 45, 18};
        System.out.println(searchArr(arr, 18));
    }
}
