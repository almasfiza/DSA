/*
trying to find O(n) solution
-4 -1 0 3 10
14 -1 0 3 10
-1 0 3 10 14
1  0 3 10 14



*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        //utilising a new array space to cut down on time complexity
        int[] res = new int[nums.length];
        
        int p = nums.length - 1;
        
        int low = 0, high = nums.length - 1;
        
        while(low <= high){
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                res[p] = nums[low]*nums[low];
                low++;
            }
            else{
                res[p] = nums[high]*nums[high];
                high--;
            }
            
            p--;
            
        }
        
        return res;
    }
}