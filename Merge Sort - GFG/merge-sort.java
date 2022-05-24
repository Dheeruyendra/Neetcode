// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int size1 = m-l+1;
         int size2 = r-m;
         
         int[] t1 = new int[size1];
         int[] t2 = new int[size2];
         
         for(int i=0; i<size1; i++){
             t1[i] = arr[l+i];
         }
         
         for(int j=0; j<size2; j++){
             t2[j] = arr[m+1+j]; 
         }
         
         int i=0, j=0, k=l;
         
         while(i<size1 && j<size2){
             if(t1[i] < t2[j]){
                 arr[k++] = t1[i++];
             }else{
                 arr[k++] = t2[j++];
             }
         }
         
         while(i<size1){
             arr[k++] = t1[i++];
         }
         
         while(j<size2){
             arr[k++] = t2[j++];
         }
         
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if (l < r){
            int mid = (l + r)/2;
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            
            merge(arr, l, mid, r);
        }
        
    }
}
