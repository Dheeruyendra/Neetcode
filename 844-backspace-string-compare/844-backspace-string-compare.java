class Solution {
    
    
       String trim(String s){
           
          Stack<Character> s1 = new Stack<>();
           
           
           for(int i=0; i<s.length(); i++){
               
               if(s.charAt(i) != '#'){
                   s1.push(s.charAt(i));
               }else if(s1.size()!=0){
                   s1.pop();
               }
               
           }
           
           return s1.toString();
           
       }
    
    public boolean backspaceCompare(String s, String t) {
         String s1 = trim(s);
         String s2 = trim(t);
        
      
        
        return s1.equals(s2);
        
    }
}