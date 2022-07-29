class Solution {
    
    double pow(double x,int n){
       
       if(n==0)return 1;
        
        double temp = pow(x, n/2);
        return (n%2 == 0)?temp*temp : temp*temp*x;
        
        
    }
    
    public double myPow(double x, int n) {
       if(x == 0)return 0;
        
        double ans = pow(x,n);
        
       
        
        return (n>0)?ans : 1/ans;
    }
}