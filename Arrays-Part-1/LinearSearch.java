public class LinearSearch {
    public static int linearSearch(int arr[], int target){
        int res = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                res = i;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        System.out.println(linearSearch(arr, 6));
    }
}
