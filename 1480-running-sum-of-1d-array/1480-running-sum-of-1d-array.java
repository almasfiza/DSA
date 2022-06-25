class Solution {
    public int[] runningSum(int[] nums) {
        //the sum array is as long as the nums array
        int sum[] = new int[nums.length];
        
        for(int i = 0 ; i < nums.length; i ++){
            int k = 0;
            while(k<=i){
                sum[i] += nums[k];
                k++;
            }
        }
        
        return sum;
        
    }
}