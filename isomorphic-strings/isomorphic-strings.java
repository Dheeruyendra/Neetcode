class Solution {
    
    /**
    
    Testcase:-
    
    "badc"
    "baba"
    
    */
    
    
    
    boolean check(String s, String t){
        
         if(s.length() != t.length() ) return false;
        
        
        HashMap<Character, Character> map = new HashMap<>();
        
        
        for(int i=0; i<s.length(); i++){
            
            Character st = s.charAt(i);
            Character tt = t.charAt(i);
            
            if(map.containsKey(st)){
                
                if(map.get(st) != tt){
                    return false;
                }
                
            }
            
            else{
                
                map.put(st, tt);
                
            }
            
        }
        
        
        return true;
        
        
        
        
    }
    
    
    public boolean isIsomorphic(String s, String t) {
        
       return check(s, t) && check(t, s);
        
    }
}