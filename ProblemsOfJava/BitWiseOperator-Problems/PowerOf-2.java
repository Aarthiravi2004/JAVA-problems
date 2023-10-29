class HelloWorld {
    public static void main(String[] args) {
         int n = 32;
        powerOfTwoOrNot(n);
    }
    public static void powerOfTwoOrNot(int n)
    {
        System.out.print((n & n-1) == 0);
    }
}
OUTPUT:
true

Explanation:
every power of two value's binary representation will contain only one 1 
so by performing the AND operation with the given number and its previou number will give the result as zero
for Eg : 1
n    = 8 = 1 0 0 0
n-1  = 7 =   1 1 1
          -----------
             0 0 0         // ans must be zero it is a power of 2 
          -----------

  Eg: 2
  n   = 5 = 1 0 1
  n-1 = 4 = 1 0 0
          ---------
            1 0 0      // not equal to zero
          ----------
