// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkPerfectSquare(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static int checkPerfectSquare(int N){
        // code here
        int temp = (int)Math.sqrt(N);
        if(temp*temp == N)return 1;
        return 0;
    }
}