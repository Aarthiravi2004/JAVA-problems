class HelloWorld {
    public static void main(String[] args) {
        int n = 120056;
        System.out.print(countZeroes(n,0));
    }
   public static int countZeroes(int n,int count)
   {
       if(n == 0)
       {
           return count;
       }
       if(n%10 == 0)
       {
           count++;
       }
       return countZeroes(n/10,count);
   }
    
}

OUTPUT:
2
