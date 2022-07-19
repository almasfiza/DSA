/*
For sides of a triangle
sum of two sides >= the third side

----------------------------------

Perimeter = summation of the side lengths

----------------------------------

2 1 2
add first two 2 + 1 = 3
iterate - find third side < = 3, if present add to sum and max = sum

- this is going to be iterated over the loop.

*/
class Solution {
    public int largestPerimeter(int[] nums) {
       
        
        Arrays.sort(nums);
        for(int i = nums.length - 3; i >= 0; i--){
            if(nums[i] + nums[i+1] > nums[i+2])
                return(nums[i] + nums[i+1] + nums[i+2]);
        }
        return 0;
        
    }
}