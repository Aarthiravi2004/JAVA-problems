class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.print(ans);
    }
   public static int fact(int n)
   {
       if(n <= 1)
       {
           return 1;
       }
       return (n*fact(n-1));
   }
    
}

OUTPUT
  120
