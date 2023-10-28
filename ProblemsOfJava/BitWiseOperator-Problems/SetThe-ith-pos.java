class HelloWorld {
    public static void main(String[] args) {
       int n= 10;
       int pos =2;
       System.out.print(bitWise(n,pos));
    }
    public static int bitWise(int n, int k)
    {
        return ((1 << k) | n);
    }
}

Explanation:
10 = 1 0 1 0 
     0 1 0 0
  -------------
     1 1 1 0         // OR operation   Ans: 14
  -------------
