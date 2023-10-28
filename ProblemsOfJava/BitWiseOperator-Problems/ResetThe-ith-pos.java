class HelloWorld {
    public static void main(String[] args) {
       int n= 20;
       int pos =2;
       System.out.print(bitWise(n,pos));
    }
    public static int bitWise(int n, int k)
    {
        return ((~(1 << k)) & n);     
    }
}
Explanation:
20 =   1 0 1 0 0
       1 1 0 1 1      // right shifting the 1 for k times and taking the complimentof it before performing the AND operation
  --------------------
       1 0 0 0 0          Ans  == 16
  --------------------
