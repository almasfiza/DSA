/*
1. Find the total sum.
2. Iterate through the array
    a. Find target - nums[i], and check if this is contained in the rest of the array
    b. return i and the position of the other element

Step 2 can be implemented using a HashMap. 
We will map out the element with their index (O(n)).
This will save us from iterating the array twice (O(n^2))


*/
class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        //storing the result of the two indices
        int[] res = new int[2];
        
        //creating a hashmap and storing the elements in the hashmap
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], i);
            }
        }
        //checking if target-nums[i] is present in the hm and also that the current occurence is not counted.
        for(int i = 0; i < nums.length; i++){
            res[0] = i;
            if(hm.containsKey(target-nums[i]) && hm.get(target-nums[i])!=i){
                res[1] = hm.get(target-nums[i]);
                break;
            }
        }
        return res;
              
        
    }
}