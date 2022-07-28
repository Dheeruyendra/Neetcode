class Solution {
    public int mySqrt(int x) {
        
        if(x == 0 || x==1)return x;
        
        long l = 0;
        long r = x;
        
        while(l < r){
            
            long mid = l+(r-l)/2;
            
            if(mid*mid <= x){
                l = mid+1;
            }else{
                r = mid;
            }
            
        }
        
        return (int)l-1;
        
    }
}