class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
          int l = 0;
          int r = arr.length-1;
        
        
          while(r-l+1 >k){
              
              if(Math.abs(arr[l] - x) <= Math.abs(arr[r] -x)){
                  r-=1;
              }else{
                  l+=1;
              }
              
          }
        
        List<Integer>  ans = new ArrayList<Integer>();
        for(int i=l; i<=r; i++){
            ans.add(arr[i]);
        }
        
        return ans;
    }
}