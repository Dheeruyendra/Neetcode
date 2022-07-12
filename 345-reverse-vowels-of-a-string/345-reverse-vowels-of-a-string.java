class Solution {
    public String reverseVowels(String s) {
        
        char[] st = s.toCharArray();
        
        int i = 0;
        int j = st.length-1;
         String  temp = "aeiouAEIOU";
         
        while(i < j){
            
             while(i<j && !temp.contains(st[i] +"")){
                 i++;
             }
            while(i<j && !temp.contains(st[j] +"")){
                j--;
            }
            
         
                char tempp = st[i];
                st[i] = st[j];
                st[j] = tempp;
                i++;
                j--;
        
            
            
        }
        
    return new String(st);
        
    }
}