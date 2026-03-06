// Q. Row with Minimum 1s. (GFG) (E)

public class MinNoOfOnes {
    public static int minRow(int mat[][]) {
        int ans = Integer.MAX_VALUE;
        int minCount = Integer.MAX_VALUE;
        
        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            
            if(count < minCount){
                minCount = count;
                ans = i+1;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 1, 1, 1},
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {1, 1, 1, 1}
        };

        System.out.println(minRow(mat));
    }
}
