class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        
        int i =0;
        int j =0;
        while(i < temp.length){
            if(arr[j] == 0){
               temp[i] = 0;
                i++;
            }
            if(i < temp.length){
            temp[i++] = arr[j++];
            }
        }
        
        for(int k=0; k< temp.length; k++){
            arr[k] = temp[k];
        }
        
    
        
    }
}