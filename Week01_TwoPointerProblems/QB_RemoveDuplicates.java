package Week01_TwoPointerProblems;

import java.util.Scanner;
// Two pointer - same direction
// T.C - O(n)
// A.S - O(1)

public class QB_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array of size  " + n + " : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for(int j = i+1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
