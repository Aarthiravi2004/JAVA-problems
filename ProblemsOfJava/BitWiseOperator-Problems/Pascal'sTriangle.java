class HelloWorld {
    public static void main(String[] args) {
        int n = 6;
        pascalsTriangle(n);
    }
    public static void pascalsTriangle(int n)
    {
        System.out.print((1 << n-1));          // determining the powers of the 2 
    }
}

OUTPUT:
32
  
Explanation:
as we know that the value of the power of 2 will have their binary number as 10 or 100 or 1000 or 10000 ...,etc so, we are shifting the 1 as per the row -1 concept
  because the rows starts from 0
