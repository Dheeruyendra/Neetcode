class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0;
        
        for( ; ti<t.length(); ti++){
            
            if(si >= s.length()){
                return true;
            }
            
            if(t.charAt(ti) == s.charAt(si)){
                si++;
            }
            
        }
        
            if(si >= s.length()){
                return true;
            }
        
        return false;
        
    }
}