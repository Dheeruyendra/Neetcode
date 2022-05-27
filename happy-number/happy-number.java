class Solution {
    
    
    int sq(int n){
        
        int sq = 0;
        
        while(n > 0){
            
            int temp = n%10;
            sq += temp*temp;
            
            n = n/10;
            
        }
        
        return sq;
        
    }
    
    public boolean isHappy(int n) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        while(n != 1){
            
             n = sq(n);
            
            if( hs.contains(n) )return false;
             hs.add(n);
            
            
        }
        
        return true;
        
    }
}