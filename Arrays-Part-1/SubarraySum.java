public class SubarraySum {
    public static void subarraySum(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sas = 0;
                for(int k=i; k<=j; k++){
                    sas += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                System.out.println("Subarray sum is : " + sas);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        subarraySum(arr);
    }
}
