package PracticeProblems_Week01;

public class ValidPalindrome {
    public static boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
    public static char lower(char c) {
        return (c >= 'A' && c <= 'Z') ? (char)(c+32) : c;
    }
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i < j) {
            char f = s.charAt(i);
            char l = s.charAt(j);
            if(!(isAlphaNum(f))){
                i++;
                continue;
            }
            if(!(isAlphaNum(l))){
                j--;
                continue;
            }
            if(lower(f) != lower(l)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }
}
