class HelloWorld {
    public static void main(String[] args) {
        int n = 123456;
        System.out.print(reverse(n,0));
    }
   public static int reverse(int n,int ans)
   {
       if(n == 0)
       {
           return ans;
       }
       ans *= 10;
       ans += n%10;
       return reverse(n/10,ans);
   }
    
}
OUTPUT:
654321

  

