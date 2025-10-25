package PracticeProblems_Week01;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
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

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height)); // 49
    }
}

