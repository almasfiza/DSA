class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //the result is going to be a list of lists of strings
        List<List<String>> result = new ArrayList<>();
        
        if(strs.length == 0) return result;
        
        HashMap <String, List<String>> hm = new HashMap<>();
        
        for(String word : strs){
            char[] hash = new char[26];
            
            for(char c : word.toCharArray()){
                hash[c - 'a']++;
            }
            
            String key = new String(hash);
            hm.computeIfAbsent(key, k -> new ArrayList<>());
            hm.get(key).add(word);
        }
        
        result.addAll(hm.values());
        return result;
        
    }
}