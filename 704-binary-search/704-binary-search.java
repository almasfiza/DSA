//https://ai.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low <= high){
            mid = (low + high) >>> 1;
            if(target > nums[mid])
                low = mid + 1;
            else if( target < nums[mid])
                high = mid - 1;
            else 
                return mid;
            
        }
        return -1;
        
    }
}