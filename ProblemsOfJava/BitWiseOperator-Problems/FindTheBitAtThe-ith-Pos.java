left shifting the bits n-1 times and performing the and operation with by adding the 1 with the shifted numbers

class HelloWorld {
    public static void main(String[] args) {
       int n= 14;
       int pos =3;
       System.out.print(bitWise(n,pos));
    }
    public static int bitWise(int n, int k)
    {
        return ((n & (1 << (k - 1))) >> (k - 1)); // 
    }
}  
Explanation:
14 = 1110
i = 3;
positions starts from the right most bits in binary representations
  1 1 1 0
  1 0 0 0   // left shifting the number 1 for k-1 times to mask it and we are doing the and operation to get the bit value as it is
  -------
  1 0 0 0
  -------
  Ans: 1 0 0 0  // again right shifting it to get the actual value 
       0 0 0 1 // ans : 1 at the 3rd position
       
  
