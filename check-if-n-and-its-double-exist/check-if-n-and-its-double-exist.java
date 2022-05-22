class Solution {
    public boolean checkIfExist(int[] arr) {
        
        if(arr.length < 2){
            return false;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        
        for(int i=0; i<arr.length; i++){
            
            
            
            if(arr[i]%2 == 0 ){
            int req = arr[i]/2;
            
            if(map.containsKey(req) && map.get(req) != i){
                return true;
            }
            
        }
            
        }
        return false;
        
    }
}