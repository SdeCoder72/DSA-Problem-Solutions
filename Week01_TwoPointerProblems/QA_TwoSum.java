package Week01_TwoPointerProblems;

import java.util.Scanner;

// Two pointer - opposite direction
// T.C - O(n)
// A.S - O(1)

public class QA_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array of size  " + n + " : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum : ");
        int t = sc.nextInt();
        int[] ans = twoSum(arr, t);
        for(int ele: ans) {
            System.out.print(ele + " ");
        }


    }
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[2];
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }
            else if(sum < target) left++;
            else right--;
        }
        return ans;
    }
}
