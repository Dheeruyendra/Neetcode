class Solution {
    

    
    public String reverseWords(String s) {
        String[]  words = s.split("\\s");
        
       
        
        StringBuilder res = new StringBuilder();
        
        for(String word:words){
            
        res.append(new StringBuilder(word).reverse().toString() + " ");
            
        }
        
        
                return res.toString().trim();
        
    }
}