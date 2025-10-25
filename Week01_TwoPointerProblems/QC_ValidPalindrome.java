package Week01_TwoPointerProblems;

import java.util.Scanner;

public class QC_ValidPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Boolean ans = isPalindrome(input);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            char first = s.charAt(left);
            char last = s.charAt(right);
            if(!(isAlphaNum(first))){
                left++;
                continue;
            }
            if(!(isAlphaNum(last))){
                right--;
                continue;
            }
            if(lower(first) != lower(last)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
    public static char lower(char c) {
        return (c >= 'A' && c <= 'Z')? (char)(c+32) : c;
    }
}
