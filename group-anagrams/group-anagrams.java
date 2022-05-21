class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
          for(String s:strs){
              char[] arr = s.toCharArray();
              Arrays.sort(arr);
              String tempString = String.valueOf(arr);
              
              if(!map.containsKey(tempString)){
                  map.put(tempString, new ArrayList<>());
              }
                  map.get(tempString).add(s);
              
              
          }
        
       return  new ArrayList ( map.values());
        
    }
}