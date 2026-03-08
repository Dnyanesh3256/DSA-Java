// Q. Code for the Bubble Sort.

import java.util.Arrays;

public class BubbleSort{
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        boolean isSwap;

        for(int i=0; i<n; i++){
            isSwap = false;

            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }

            if(isSwap == false){
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 1, 2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}