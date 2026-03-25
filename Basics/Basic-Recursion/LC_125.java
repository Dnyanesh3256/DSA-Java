// Q. Valid Palindrome. (Leetcode - 125) (E)

public class LC_125 {
    public static boolean validPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(str));
    }
}
