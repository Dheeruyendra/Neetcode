class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums1.length; i++){
           
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }
            
         else   map.put(nums1[i], 1);
        }
        
        List<Integer> temp = new ArrayList<>();
        
        for(int i:nums2){
            if(map.containsKey(i)){
                temp.add(i);
                if(map.get(i) == 1)map.remove(i);
                else map.put(i, map.get(i)-1);
            }
        }
        
        int[] ans = new int[temp.size()];
        
        for(int i=0; i<ans.length; i++){
            ans[i] = temp.get(i);
        }
        
        return ans;
        
    }
}