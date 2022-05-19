class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] temp = s.toCharArray();
        
        for(char i:temp){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        
        for(int i=0; i<temp.length; i++){
            if(map.get(temp[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}