class Solution {
    public static String replaceSym(String s){
        /*** Escape characters don't work
        
        for(int i = 0 ; i < s.length(); i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                //remove the symbols
                s = s.replace(Character.toString(s.charAt(i)),"");
            }
        }
        
        ***/
        
        
        //conver to lower case since the input output is not case sensitive
        s = s.toLowerCase();
        String res = "";
        for(int i = 0; i < s.length(); i++){
           if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) res += s.charAt(i);
        }
        return res;
    }
    public boolean isPalindrome(String s) {
        
        //test 1 : to check if the string is modified
        System.out.println(replaceSym(s));
        s = replaceSym(s);
        int len = s.length();
        for(int i = 0; i < len/2 ; i++){
            if(s.charAt(i) != s.charAt(len-1-i)) return false;
        }
        return true;
    }
}