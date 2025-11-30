// Q. Searching if element is present in an two dimensional array or not.

public class SearchInTwoDArray {
    public static boolean searchArr(int arr[][], int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(searchArr(arr, 5));
    }
}
