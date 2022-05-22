class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
         if(nums1.length == 0 || nums2.length == 0){
                return;
                
            }
        
        int[] temp = new int[m+n];
        
        int j=0, k=0;
        
         int i =0;
        
        while(j<m  && k<n){
            
           
            
            if(nums1[j] < nums2[k] ){
                temp[i++] = nums1[j++];
                    
            }else{
             temp[i++] = nums2[k++];
                 
            }
            
        }
        
        while(k<n){
            temp[i++]=nums2[k++];
        }
        
        while(j<m){
            temp[i++]=nums1[j++];
        }
        
        for(int l=0; l<temp.length; l++){
            nums1[l] = temp[l];
        }
        
    }
}