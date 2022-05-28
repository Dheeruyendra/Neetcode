class Solution {
    
    
       boolean isvalid(int[] arr , int index){
        int l = index-1;
        int r = index+1;
        
        while(l >= 0){
            if(arr[l] >=arr[l+1]) return false;
            l--;
        }
        
        while(r < arr.length){
            if( arr[r] >= arr[r-1]) return false;
            r++;
        }
        
        return true;
    }
    
    
    
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        
       
       for(int i=1; i<arr.length-1; i++){
           
           if(isvalid(arr, i)){
               return true;
           }
           
           
       }
        
        return false;
          
        
    }
}