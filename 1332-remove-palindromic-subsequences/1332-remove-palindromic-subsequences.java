class Solution {
    public int removePalindromeSub(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length-1;
        while(l < r){
            if(chars[l++]!=chars[r--]) return 2;
        }
        return 1;
    }
}