class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
         int n = s.length();
        
        for(int ti = 0; ti<t.length() && si < n; ti++){
            
           
            if(t.charAt(ti) == s.charAt(si)){
                si++;
            }
            
        }
        
        return (si == n)? true: false;
        
    }
}