class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int end = k; end < nums.length; end++) {
            sum = sum - nums[end - k]; 
            sum = sum + nums[end];     

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }
}