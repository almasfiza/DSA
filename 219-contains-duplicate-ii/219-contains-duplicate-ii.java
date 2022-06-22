/*
Approach one - O(n2) - iterating through the loop twice to keep the pointers i and j for the two indices.

Approach two - O(n) - Use hashmap to store the map(nums[i],i) and then if a duplicate exists, use the condition to retreive the element(index) of the key(nums[i])




*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for(i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i) <= k){
                    return true;
                }
                map.put(nums[i],i);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
        
    }
}