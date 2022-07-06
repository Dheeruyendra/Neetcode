class Solution {
    public String defangIPaddr(String address) {
             StringBuilder st = new StringBuilder();
        
              String rep = "[.]";
        
              for(int i=0; i<address.length(); i++){
                  
                  Character ch = address.charAt(i);
                  
                  if(ch.equals('.')){
                      st.append(rep);
                  }
                  else st.append(address.charAt(i));
                  
              }
        
        return st.toString();
        
    }
}