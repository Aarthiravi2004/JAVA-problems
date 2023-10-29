class HelloWorld {
    public static void main(String[] args) {
        int n = 123456;
        int sum = 0;
        System.out.print(sumOfDigits(n,sum));
    }
   public static int sumOfDigits(int n,int sum)
   {
       if(n==0)
       {
           return sum ;
       }
       sum += n%10;
       return sumOfDigits(n/10 , sum);
   }
    
}

OUTPUT:
21
