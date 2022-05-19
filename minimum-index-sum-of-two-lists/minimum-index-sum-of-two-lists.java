class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String, Integer> m1 = new HashMap<>();
       
        
        for(int i=0; i<list1.length; i++){
            
            m1.put(list1[i], i);
            
        }
        
        
        List<String> ansTemp = new ArrayList<>();
        int minIndex = Integer.MAX_VALUE;  
        
        for(int i=0; i<list2.length; i++){
            
            if(m1.containsKey(list2[i])){
                
                int temp = i+m1.get(list2[i]);
                
                if(minIndex > temp){
                    minIndex = temp;
                    ansTemp.clear();
                    ansTemp.add(list2[i]);
                }else if(minIndex == temp){
                    ansTemp.add(list2[i]);
                }
                
            }
            
        }
        
        String[] ans = new String[ansTemp.size()];
        
        for(int i=0; i<ans.length; i++){
            ans[i] = ansTemp.get(i);
        }
        
        return ans;
        
    }
}