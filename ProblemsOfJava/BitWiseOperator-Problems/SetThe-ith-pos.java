class HelloWorld {
    public static void main(String[] args) {
       int n= 16;
       int pos =2;
       System.out.print(bitWise(n,pos));
    }
    public static int bitWise(int n, int k)
    {
        return ((1 << k) | n);
    }
}

Explanation:
16 = 1 0 0 0 
     0 1 0 0
  -------------
     1 1 0 0         // OR operation 
  -------------
