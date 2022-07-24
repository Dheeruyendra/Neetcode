class Solution {
    public int findMin(int[] nums) {
           int low = 0;
           int high = nums.length-1;
           int min = nums[0];
        
           while(low <=  high){
               
               int mid = (low+high)/2;
               
               if(nums[low] <= nums[mid] ){
                   
                   min = Math.min(min, nums[low]);
                   low = mid+1;
                   
               }else{
                   high = mid;
               }
               
           }
        return min;
    }
}