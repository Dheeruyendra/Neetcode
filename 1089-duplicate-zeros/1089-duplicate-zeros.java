class Solution {

    public void duplicateZeros(int[] arr) {
        int r = arr.length - 2;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = r; j >= i; j--) {
                    arr[j + 1] = arr[j];
                }

                arr[i] = 0;
                i++;  // duplicated zero was not present in the original array so not used to duplicate again
            }
        }
    }
}
/**  
  
  1 2 0 4 5
  1 2 0 0 4


**/
