// Q. Find the smallest letter greater than target. (Leetcode - 744) (E)

public class LC_744 {
    public static char nextGreatChar(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(letters[mid] > target){
                end = mid - 1;
            }else{
                start = end + 1;
            }
        }

        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'f';

        System.err.println(nextGreatChar(letters, target));
    }
}
