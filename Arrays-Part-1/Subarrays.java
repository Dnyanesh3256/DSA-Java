public class Subarrays {
    public static void printSubarrays(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sas = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sas += arr[k];
                }
                System.out.println();
                System.out.println(sas);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubarrays(arr);
    }
}
