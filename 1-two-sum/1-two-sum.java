class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a hm <number, index>
        HashMap <Integer, Integer> hm = new HashMap <>();
        
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], i);
            }
        }
            
        //test 1- checking if the hm is created properly - works
        //System.out.println(hm);
        
        int[] res = new int[2];
        
        for(int i = 0 ; i < nums.length; i++){
            int a = nums[i];
            res[0] = i;
            int find = target - a;
            if(hm.containsKey(find) && hm.get(find)!=i){
                res[1] = hm.get(find); 
                break;
                
            }
        }
            
        return res;
    }
}