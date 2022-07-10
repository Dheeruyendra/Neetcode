class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
          for(int i=0; i<nums.length-2; i++){
              
              if(i > 0 && nums[i] == nums[i-1])continue;
              
              int target = -nums[i];
              
              int j = i+1;
              int k = nums.length-1;
              
               while(j < k){
                   
                   if(nums[j]+nums[k] == target){
                       List<Integer> temp = new ArrayList<>();
                       temp.add(nums[i]);
                       temp.add(nums[j]);
                       temp.add(nums[k]);
                       
                       ans.add(temp);
                       
                       k--;
                       j++;
                       //[-2, -2, 0, 0, 2, 2]
                       while(j < k && nums[j] == nums[j-1]){
                           j+=1;
                       }
                       
                       
                   }else if(nums[j] + nums[k] < target){
                       j++;
                   }else {
                       k--;
                   }
                   
                   
               }
              
          }
        
        return ans;
        
    }
}