class Solution {
    public boolean isPalindrome(int x) {
        
          char[] temp = Integer.toString(x).toCharArray();
        int i = 0;
        int j = temp.length-1;
        
        while(i<j){
            
            if(temp[i] != temp[j])return false;
            i++;
            j--;
        }
        
        return true;
        
    }
}