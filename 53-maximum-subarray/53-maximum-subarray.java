class Solution {
    //find the sum of the sub array passed with the starting and the ending index
    public int findSum(int[] nums, int st, int end){
        int sum = 0;
        for(int i = st; i <= end; i++){
            sum += nums[i];
        }
        return sum;
    }
    public int maxSubArray(int[] nums) {
        //initialising the max
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(currSum < 0) currSum = 0;
            currSum += nums[i];
            max = Math.max(max, currSum);
        }
        
        return max;
    }
}