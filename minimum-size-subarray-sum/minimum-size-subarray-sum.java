class Solution {
    public int minSubArrayLen(int target, int[] nums) {
             int left = 0;
             int sum = 0;
             int ans = Integer.MAX_VALUE;  
        
          for(int i=0; i<nums.length; i++){
              
              sum+=nums[i];
              
              while(sum >= target){
                  
                  ans = Math.min(ans, i+1-left);
                  sum -= nums[left++];
                  
              }
              
          }
        
        return (ans != Integer.MAX_VALUE)?ans : 0;
            
    }
}