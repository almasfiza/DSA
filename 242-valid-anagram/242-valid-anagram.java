class Solution {
    public boolean isAnagram(String s, String t) {
        //base condition
        if(s.length() != t.length()) return false;
        
       //hashmap for string s
        HashMap <Character, Integer> hm = new HashMap <>();
        
        //adding elements to the hashmap
        for(int i = 0 ; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        
        //test 1- to check if the hashmap is correctly stored
        //System.out.println(Arrays.asList(hm));
        
       
        
        for(int i = 0 ; i < t.length(); i++){
            char c = t.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);
            }
        }
        
        //test 2- to check if the hashmap is modified
        //System.out.println(Arrays.asList(hm));
  
        for(int i = 0 ; i < hm.size() ; i++){
            if(hm.get(s.charAt(i)) != 0) return false;
        } 
        
        return true;
        
    }
}