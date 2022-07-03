class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
          
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        int r = mat.length;
        int c = mat[0].length;
        
        int[] res = new int[r*c];
        
        for(int i=0; i<mat.length; i++){
            
            for(int j=0; j<mat[i].length; j++){
                
                int sum = i+j;
                
                if(!map.containsKey(sum)){
                    map.put(sum, new ArrayList<Integer>());
                }
                
                map.get(sum).add(mat[i][j]);
                
            }
            
        }
        
        
        int x = 0;
        
        for(Map.Entry<Integer, List<Integer>>entry: map.entrySet()){
               List<Integer> ans = new ArrayList<>();
            
              if(entry.getKey()%2 == 0){
                  
                     ans = entry.getValue();
                  
                     Collections.reverse(ans);
                  
              }else{
                  
                  ans = entry.getValue();
                  
              }
            
            
            for(int i=0; i<ans.size(); i++){
                
                res[x++] = ans.get(i);
                
            }
            
            
        }
        
        
     
        
            return res; 
        
        
        
        
    }
}