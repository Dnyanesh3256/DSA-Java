// Q. Selection Sort. (GFG) (E)

import java.util.Arrays;

public class SelectionSortGFG {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;

            int maxIdx = 0;
            for(int j=0; j<=last; j++){
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }

            int temp = arr[last];
            arr[last] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
