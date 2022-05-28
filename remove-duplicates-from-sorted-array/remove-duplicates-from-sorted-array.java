class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1)return nums.length;
        
        int un = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(i==0 || nums[i] != nums[i-1]  )un += 1;
            
        }
        
        
        int[] unique = new int[un];
        int j = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(i==0 || nums[i]!=nums[i-1]) unique[j++] = nums[i];
            
        }
        
        for(int i=0; i<un; i++){
         
             nums[i] = unique[i];
             
        }
        
        return un;
        
        
        
    }
}