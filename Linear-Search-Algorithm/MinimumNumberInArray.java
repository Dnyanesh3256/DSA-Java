// Q. Searching the minimum number in an array.

public class MinimumNumberInArray {
    public static int findMinimum(int arr[]){
        int minimum = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        int arr[] = {25, 30, 65, 89, 45, 18};
        System.out.println(findMinimum(arr));
    }
}
