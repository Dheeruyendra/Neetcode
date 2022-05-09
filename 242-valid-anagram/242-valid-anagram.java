class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] ss = s.toCharArray();
           char[] st = t.toCharArray();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(Character ch: ss){
            
            if(map.containsKey(ch)){
                map.replace(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
            
        }
        
        for(Character ch: st){
            if(!map.containsKey(ch))return false;
            else{
                
                if(map.get(ch) == 1) map.remove(ch);
                else{
                    map.replace(ch, map.get(ch) -1);
                }
                
            }
        }
        
        if(map.isEmpty())return true;
        return false;
        
    }
    
    /** 
    
    anagram  aa n g r m
    nagaram  aa n g r m
    
    rat       r a t   
    car       r a c
    
    
    a - 2        1 0
    n - 1        0
    g - 1        0 
    r - 1        0
    m - 1        0
    
    map.empty();
    
    
    r a t      
    c a r
    
    r - 1 0
    a - 1 0
    t - 1 1
    
    !map.empty()
    
    **/
    
}