// Q. Count Character Frequency.

public class CountCharFrequency {
    public static int countFreq(String str, char ch){
        char[] strArr = str.toCharArray();
        int[] freqArr = new int[26];

        for(int i=0; i<strArr.length; i++){
            freqArr[strArr[i] - 'a'] += 1;
        }

        return freqArr[ch-'a'];
    }

    public static void main(String[] args) {
        String str = "dnyaneshwar";
        System.out.println(countFreq(str, 'a'));
    }
}
