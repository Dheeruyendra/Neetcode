class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
         
          if(numRows == 1){
              List<Integer> row = new ArrayList<>();
              row.add(1);
              res.add(row);
              
              return res;
          }
         
         for(int i=0; i< numRows; i++){
             
             List<Integer> row = new ArrayList<>();
             
             for(int j=0; j<i+1; j++){
                 if(j==0 || j==i){
                     row.add(1);
                 }else{
                      
                    
                     
                     row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                 }
             }
             res.add(row);
         }
        
        
         return res;
    }
}