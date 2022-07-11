class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n- 1, k = m + n - 1;
       // i is for end of nums1, where the elements exist, j is for end of nums2 and k is for real end of nums1
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
		// this while loop is for the condition when nums1 doesn't contain any element.
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}