class Solution {
    public int[] plusOne(int[] digits) {
         List<Integer> temp = new ArrayList<>();
        
        
        int carry = 1;
        
        for(int i=digits.length-1; i>=0; i--){
            
            carry += digits[i];
            
            temp.add(carry%10);
            carry = carry/10;
            
            
        }
        
        if(carry != 0){
            temp.add(carry);
        }
        
        int[] ans = new int[temp.size()];
        
        int j = temp.size()-1;
        
        for(int i=0; i<ans.length; i++){
            
            ans[i] = temp.get(j);
            j--;
            
            
        }
        
        return ans;
    }
}