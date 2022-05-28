class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        boolean[] temp = new boolean[nums.length+1];
        
        
        for(int i=0; i<nums.length; i++){
                temp[nums[i]] = true;
        }
        
        for(int i=1; i<temp.length; i++){
            if(temp[i] != true)ans.add(i);
        }
        
        return ans;
        
    }
}