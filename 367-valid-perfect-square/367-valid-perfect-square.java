class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int h = num;
       
          while(l <= h){
              
            int mid = l+(h-l)/2;
              
             if(num/mid == mid && num%mid == 0)return true;
              else if(num/mid <mid)h = mid-1;
              else l = mid+1;
              
          }
        
        
        return false;
        
    }
    
}