class Solution {
    public int strStr(String haystack, String needle) {
        
          int np = 0;
        
         for(int i=0; i<haystack.length(); i++){
             
             if(haystack.charAt(i) == needle.charAt(np)){
                 
                 int k = i;
                 
                 while(np<needle.length() && k<haystack.length()){
                     
                     if(needle.charAt(np) != haystack.charAt(k)){
                         break;
                     }
                     
                    np++;
                     k++;
                 }
                 
                 if(np == needle.length())return i;
                 
                 np = 0;
             }
             
             
         }
        
        return -1;
        
        
    }
}