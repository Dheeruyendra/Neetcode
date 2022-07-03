class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0 || nums.length == 0 || k== nums.length ){
            return ;
        }
        
        int[] temp = new int[nums.length];
        
         if(k >nums.length){
             k= k%nums.length;
         }
        
         int r = nums.length-k;
          int i=0;
        while(r<nums.length){
           temp[i++] = nums[r++];
            
        }
         r=0;
        while(r<nums.length-k){
            temp[i++] = nums[r];
            r++;
        
        }
        
        
        for(int j=0; j<nums.length; j++){
            nums[j] = temp[j];
        }
        
        return;
        
    }
}