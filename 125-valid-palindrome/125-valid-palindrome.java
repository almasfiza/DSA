class Solution {
    public boolean isAlphaNum(char c){
        if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) return true;
        else return false;
    }
    public boolean isPalindrome(String s) {
        int p1 = 0; //pointer 1
        int len = s.length();
        int p2 = len - 1; //pointer 2
        s = s.toLowerCase(); //to compare only the lower case versions
        while(p1 < p2){
            while(p1 < p2 && !isAlphaNum(s.charAt(p1))) p1++;
            while(p2 > p1 && !isAlphaNum(s.charAt(p2))) p2--;
            
            //ruling out, if the characters ain't same.
            if(s.charAt(p1) != s.charAt(p2)) return false;
            
            p1++; p2--;
        }
        return true;
    }
}