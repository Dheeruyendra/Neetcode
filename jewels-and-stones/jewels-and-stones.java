class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> j = new HashSet<>();
        
        for(int i=0; i<jewels.length(); i++){
            j.add(jewels.charAt(i));
        }
        
        int count = 0;
        
        for(int i=0; i<stones.length(); i++){
            if(j.contains(stones.charAt(i))) count+=1;
        }
        
        return count;
        
    }
}