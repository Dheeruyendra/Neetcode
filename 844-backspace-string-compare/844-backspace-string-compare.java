class Solution {
    public boolean backspaceCompare(String s, String t) {
          Stack<Character> s1 = new Stack<>();
         Stack<Character> s2 = new Stack<>();
        
        int i = 0;
        int j = 0;
        
        while(i < s.length()){
            
            if( s.charAt(i) == '#'){
               if(s1.size()>0) s1.pop();
              
            }else{
                s1.push(s.charAt(i));
            }
            
            i++;
        }
        
        while( j < t.length()){
            
            if(  t.charAt(j) == '#'){
              if(s2.size()>0)  s2.pop();
            }else{
                s2.push(t.charAt(j));
            }
            
            j++;
        }
        
        return s1.equals(s2);
        
    }
}