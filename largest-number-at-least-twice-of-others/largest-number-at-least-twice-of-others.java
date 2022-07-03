class Solution {
    public int dominantIndex(int[] nums) {
        
        int l = 0;
        
        for(int i=1; i<nums.length; i++){
            
            if(nums[i] > nums[l]){
              l = i;
            }
            
        }
        
        
        for(int i=0; i<nums.length; i++){
              if(nums[i] != nums[l]){
                  
                  if(nums[i]*2 > nums[l])return -1;
                  
              }
        }
        
        return l;
        
    }
}