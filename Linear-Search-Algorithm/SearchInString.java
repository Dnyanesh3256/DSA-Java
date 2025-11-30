// Q. Searching if character is present in a string or not.

public class SearchInString {
    public static boolean checkStr(String s, char target){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == target){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "Dnyaneshwar";
        System.out.println(checkStr(str, 'n'));
    }    
}
