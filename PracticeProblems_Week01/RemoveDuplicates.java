package PracticeProblems_Week01;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        for(int j = 1; j<n; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        System.out.println(removeDuplicates(nums1)); // 2

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2)); // 5
    }
}

