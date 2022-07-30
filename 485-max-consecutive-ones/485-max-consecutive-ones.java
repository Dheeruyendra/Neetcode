class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
            int curr = 0;
            int max = 0;
        
          for(int num:nums){
              if(num == 1)curr+=1;
              else{
                  max = Math.max(curr, max);
                  curr = 0;
              }
          }
        
         return Math.max(curr, max);
          
    }
}