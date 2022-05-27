class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        
          char[] string = s.toCharArray();
        
        int maxlength =0;
        
        for(int i=0; i<string.length; i++){
           int count =0;
            HashSet<Character> hs = new HashSet<>();
            
            for(int j=i; j<string.length; j++){
               if (hs.contains(string[j])){
                        break;
                }else{
                   count+=1;
                   hs.add(string[j]);
               }
            }
            if(maxlength < count) maxlength= count;
            
        }
        
        return maxlength;
        
    }
}