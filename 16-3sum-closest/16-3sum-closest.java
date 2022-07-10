class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int ct = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length-2; i++){
            
            int sum = nums[i];
            int l = i+1;
            int r = nums.length-1;
            
            while(l < r){
                
               sum = nums[i] + nums[r] + nums[l];
                
                if(Math.abs(sum - target) < Math.abs(ct - target)){
                    ct  = sum;
                }
                
                if(sum > target){
                    r--;
                }else{
                    l++;
                }
                
                
            }
            
            
        }
        return ct;
    }
}