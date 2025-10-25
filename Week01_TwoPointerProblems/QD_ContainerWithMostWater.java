package Week01_TwoPointerProblems;

import java.util.Scanner;

public class QD_ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array of size  " + n + " : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = maxArea(arr);
        System.out.println(ans);
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxWtrArea = 0;
        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = w*h;
            maxWtrArea = Math.max(area, maxWtrArea);
            while(left < right && height[left] <= h) left++;
            while(left < right && height[right] <= h) right--;
        }
        return maxWtrArea;
    }
}
