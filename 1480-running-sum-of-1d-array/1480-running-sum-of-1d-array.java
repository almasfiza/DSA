class Solution {
    public int[] runningSum(int[] nums) {
        
        
        //another way could be to make modification in place
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
        
    }
}