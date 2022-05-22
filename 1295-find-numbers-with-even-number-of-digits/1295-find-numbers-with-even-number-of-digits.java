class Solution {
    
    boolean isEven(int num){
        
        int count = 0;
        
        while(num>0){
            num = num/10;
            count+=1;
        }
        
        if(count % 2 == 0)return true;
        return false;
        
    }
    
    public int findNumbers(int[] nums) {
        
        int count = 0;
        
        for(int num:nums){
            if(isEven(num))count+=1;
        }
        
        return count;
        
    }
}