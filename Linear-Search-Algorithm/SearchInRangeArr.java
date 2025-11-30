// Q. Searching if element is present in an array in a given range.

public class SearchInRangeArr {
    public static boolean searchArr(int arr[], int target, int s, int e){
        for(int i=s; i<=e; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {25, 30, 65, 89, 45, 18};
        System.out.println(searchArr(arr, 45, 1, 4));
    }    
}
