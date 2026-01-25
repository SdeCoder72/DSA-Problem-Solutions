class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n= nums.length;
        int minDiff=Integer.MAX_VALUE;
        for(int i=k-1; i<n; i++){
            minDiff=Math.min(minDiff, nums[i] - nums[i-k+1]);
        }
        return minDiff;
    }
}
