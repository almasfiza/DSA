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
        
        //returning the result as an array of two indices who satisfy the two sum
        int[] res = new int[2];
        
        
        for(int i = 0 ; i < nums.length; i++){
            
            int a = nums[i];
            //storing the index of the first element.
            res[0] = i;
            
            //subtracting from target to find if the other element exists in the hm and also to make sure that the current element is not considered.
            int find = target - a;
            if(hm.containsKey(find) && hm.get(find) != i){
                res[1] = hm.get(find); 
                //breaking as soon as the "exactly once" result is found.
                break;
                
            }
        }
            
        return res;
    }
}