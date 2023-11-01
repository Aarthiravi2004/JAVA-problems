class HelloWorld {
    public static void main(String[] args) {
         int n = 40;
         boolean primes[] = new boolean[n+1];
        isPrime(n,primes);
    }
    public static void isPrime(int n,boolean[] primes)
    {
        for(int i=2; i*i <=n;i++)
        {
            if(!primes[i])
            {
                for(int j=i*2;j<=n;j+=i)
                {
                    primes[j]=true;
                }
            }
            
        }
        for(int i=2;i<=n;i++)
        {
            if(!primes[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}

OUTPUT:
2 3 5 7 11 13 17 19 23 29 31 37 
