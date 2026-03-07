// Q. Search in a Sorted Matrix. (GFG) (M)

public class SearchInSortedMatrix2 {
    public static boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
        
        int start = 0;
        int end = n * m - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            int row = mid / m;
            int col = mid % m;
            
            if(mat[row][col] == x){
                return true;
            }
            
            if(mat[row][col] > x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 5, 9},
            {14, 20, 21},
            {30, 34, 43}
        };

        System.out.println(searchMatrix(mat, 14));
    }
}
