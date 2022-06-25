class Solution {
    public int[] runningSum(int[] nums) {
        //the sum array is as long as the nums array
        int sum[] = new int[nums.length];
        
        //initially the zeroeth element is the same
        sum[0] = nums[0];
        
        //the sum at each index is like cumulative sum of the previous element of the sum[]
        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        
        return sum;
        
    }
}