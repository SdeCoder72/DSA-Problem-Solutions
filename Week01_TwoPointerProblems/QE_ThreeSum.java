package Week01_TwoPointerProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QE_ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array of size  " + n + " : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);   //O(n log n)
        List<List<Integer>> ans = new ArrayList<>();
        if(arr == null || n < 3) return ans;
        for(int i = 0; i<n-2; i++) {
            if(arr[i] > 0) break;
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int left = i+1;
            int right = n-1;
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while(left < right && arr[left] == arr[left+1]) left++;
                    while(left < right && arr[right] == arr[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        return ans;
    }
}
