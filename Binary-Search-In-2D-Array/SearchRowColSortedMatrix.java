// Q. Search in a Row-Column Sorted. (GFG) (E)

public class SearchRowColSortedMatrix {
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length;
        int m = mat[0].length;
        
        int row = 0;
        int col = m - 1;
        
        while(row < n && col >= 0){
            if(mat[row][col] == x){
                return true;
            }
            
            if(mat[row][col] > x){
                col--;
            }else{
                row++;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {3, 30, 38},
            {20, 52, 54},
            {35, 60, 69}
        };

        System.out.println(matSearch(mat, 52));
    }
}
