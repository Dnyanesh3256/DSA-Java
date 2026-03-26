// Q. Counting Frequencies of Array Elements.

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 4};

        int[] freqArr = new int[5];
        for(int i=0; i<arr.length; i++){
            freqArr[arr[i]] += 1;
        }

        // give frequency count of number 1.
        System.out.println(freqArr[1]);

        // give frequency count of number 4.
        System.out.println(freqArr[4]);
    }
}
