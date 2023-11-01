class Solution {
    public double myPow(double x, int n) {
         double ans=1.0;
         if(n > 0){
         for(int i=1;i<=n;i++)
         {
             ans*=x;
         }
         return ans;
         }
         else
         {
             n=Math.abs(n);
             for(int i=1;i<=n;i++)
         {
             ans*=x;
         }
         return 1/ans;
         }
    }
}

OUTPUT:
x = 2.00000
n = -2;

0.25;
