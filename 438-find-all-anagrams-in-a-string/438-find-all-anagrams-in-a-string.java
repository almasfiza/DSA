class Solution {
  public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int cntMatch = 0;
        int[] pMap = new int[256];
        for (char c : p.toCharArray()) {
            pMap[c]++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char sChar = s.charAt(right);
            pMap[sChar]--;
            if (pMap[sChar] + 1 > 0) {
                cntMatch++;
            }
            while (cntMatch == p.length()) {
                if (right - left + 1 == p.length()) {
                    result.add(left);
                }
                sChar = s.charAt(left);
                pMap[sChar]++;
                if (pMap[sChar] - 1 >= 0) {
                    cntMatch--;
                }
                left++;
            }
        }
        return result;
    }
}