// Q. Guess Number Higher or Lower. (Leetcode - 374) (E)

public class LC_374 {
    public static int guessNumber(int n){
        int start = 1;
        int end = n;
        int num = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // int num = guess(mid);

            if(num == 0){
                return mid;
            }else if(num == -1){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
    }
}