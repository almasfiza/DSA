class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Using a hashset
        final HashSet<Integer> list = new HashSet<>();
        for(int num: nums){
            if(list.contains(num)){
                return true;
            }
            else{
                list.add(num);
            }
        }
        return false;
    }
}