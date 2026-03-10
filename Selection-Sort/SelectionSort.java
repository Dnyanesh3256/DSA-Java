// Q. Code for the Selection Sort.

import java.util.Arrays;

public class SelectionSort{
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIdx = 0;
            for(int j=0; j<last; j++){
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }

            int temp = arr[maxIdx];
            arr[maxIdx] = arr[last];
            arr[last] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}