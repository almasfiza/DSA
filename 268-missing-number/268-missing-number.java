/*
1. Sort the array
2. if the difference between any two elements is not equal to 1, then there is a skip - so that is the missing number in the array


*/
class Solution {
    public int missingNumber(int[] nums) {
        
        if(nums.length == 1) 
            if(nums[0] == 1) return 0;
            else return nums[0]+1;
        
        Arrays.sort(nums);
        
        if(nums[0] != 0) return 0;
        
        for(int i = 1; i < nums.length; i ++){
            
            if(nums[i] - nums[i-1] != 1){
                return (nums[i] + nums[i-1]) / 2;
            }
        }
        
        return nums[nums.length-1]+1;
        
    }
}