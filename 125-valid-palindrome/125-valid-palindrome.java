class Solution {
    public boolean isPalindrome(String s) {
         s =  s.toLowerCase();
        
          List<Character> temp = new ArrayList<>();
        
          for(int i=0; i<s.length(); i++){
              if(Character.isLetterOrDigit(s.charAt(i))){
                  temp.add(s.charAt(i));
              }
          }
        
          int i = 0;
          int j = temp.size()-1;
        
        while(i < j){
            
           if(!temp.get(i).equals(temp.get(j)))return false;
            i++;
            j--;
            
        }
        
        return true;
        
    }
}