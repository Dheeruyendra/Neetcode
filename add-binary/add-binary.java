class Solution {
    public String addBinary(String a, String b) {
       
        int i = a.length()-1;
        int j = b.length()-1;
        
        int  c = 0;
        
        StringBuilder temp = new StringBuilder();
        
        while(i >=0 || j>=0 || c > 0){
            
           
            
            if(i >= 0)  c += a.charAt(i)- '0';
            if(j >= 0)  c += b.charAt(j)- '0';
            
            temp.append((char)(c%2+'0'));
            
            c/=2;
            
            i--;
            j--;
            
            
        }
        
        temp = temp.reverse();
        
        String ans = temp.toString();
        
        return ans;
        
        
        
        
    }
}