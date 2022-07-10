class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
          int count = 0;
        
          for(int i=0; i<nums.length; i++){
              
              int prod = nums[i];
              if(prod < k )count +=1;
              
              int j = i+1;
              
              while(j < nums.length &&  prod*nums[j] < k){
                  prod *= nums[j];
                  count +=1;
                  j++;
              }
              
              
          }
        
        return count;
        
    }
}