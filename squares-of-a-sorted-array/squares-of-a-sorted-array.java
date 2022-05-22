class Solution {
    public int[] sortedSquares(int[] nums) {
        
         if(nums.length ==1){
             nums[0] = nums[0]*nums[0];
             return nums;
         }
        
        int p1 =0;
        int p2=nums.length-1;
        int[] ans = new int[nums.length];
        int p3 =ans.length-1;
        
        while(p1<=p2){
            
            if(nums[p1]*nums[p1]>=nums[p2]*nums[p2]){
                ans[p3--] = nums[p1]*nums[p1];
                p1++;
            }else{
              ans[p3--] =nums[p2]*nums[p2];
                p2--;
                
            }
            
        }
        
        
        
      
      return ans;  
    }
}