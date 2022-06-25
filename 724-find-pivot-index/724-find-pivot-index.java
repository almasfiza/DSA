class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, sum = 0;
        //storing the total sum of the elements in the array
        for(int x: nums) sum += x;
        //finding the sum to the right 
        for(int i = 0 ; i < nums.length; i++){
            if(leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}