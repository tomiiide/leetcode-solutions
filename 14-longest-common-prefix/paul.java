/**
* https://leetcode.com/problems/longest-common-prefix
**/
class Solution {
    /**
    * Check for the common prefix between the first and second item
    * Continually use the prefix and compare it with the remainder of the item on the list
    *
    * thus:
    * prefix = prefixOf(a, b)
    * prefix = prefixOf(prefix, c)
    * prefix = prefixOf(prefix, d)
    *
    * Time Complexity:
    * O(N S) in worst case, best case i believe will be O(N . min(a, b))
    * S = Sum of characters
    **/
    public String longestCommonPrefix(String[] strs) {
        String commonString = "";
        
        if(strs.length < 2) return strs[0];
        
        //O(S) 
        commonString = commonPrefix(strs[0], strs[1]);
        
        //O(N-2) -> O(N)
        for(int i = 2; i < strs.length; i++) {
            //O(S)
            commonString = commonPrefix(commonString, strs[i]);
        }
        
        return commonString;
    }
    
    public String commonPrefix (String a, String b) {
        String commonString = "";
        int len = Math.min(a.length(), b.length());
        for(int k = 0; k < len; k++) {
            if(a.charAt(k) == b.charAt(k)) {
                commonString += String.valueOf(a.charAt(k));
            } else {
                break;
            }
        }
        return commonString;
    }
}
