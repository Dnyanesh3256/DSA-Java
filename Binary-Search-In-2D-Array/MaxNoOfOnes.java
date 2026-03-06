// Q. Maximum no of 1's row

public class MaxNoOfOnes {
    public static int maxOnes(int Mat[][], int N, int M) {
        // your code here
        int ans = -1;
        int maxCount = -1;
        for(int i=0; i<N; i++){
            int count = 0;
            for(int j=0; j<M; j++){
                if(Mat[i][j] == 1){
                    count++;
                }
            }
            
            if(count > maxCount){
                maxCount = count;
                ans = i;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int Mat[][] = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };

        System.out.println(maxOnes(Mat, 3, 4));
    }
}
