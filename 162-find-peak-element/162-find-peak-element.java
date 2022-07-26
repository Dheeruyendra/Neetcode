class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        
        for( ;i<nums.length-1; i++){
            
            if(nums[i] > nums[i+1]){
                return i;
            }
            
        }
        
        
        return i;
    }
}