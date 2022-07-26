class Solution {
    
    int binarySearch(int[] nums, int target, boolean leftbias){
          
              int l = 0;
              int r = nums.length-1;
              int index = -1;
        
            while(l <= r){
                
                int mid = l+(r-l)/2;
                
                if(nums[mid] < target){
                    l = mid+1;
                }else if(nums[mid] > target){
                     r = mid-1;
                }
                else{
                    
                     index = mid;
                    if(leftbias) r = mid-1;
                    else{
                        l = mid+1;
                    }
                     
                    
                }
                    
                }
        
        return index;
                
        
    }
    
    public int[] searchRange(int[] nums, int target) {
        
           int left = binarySearch(nums,target, true);
           int right = binarySearch(nums,target, false);
        
             return new int[]{left, right};
        
        
    }
}