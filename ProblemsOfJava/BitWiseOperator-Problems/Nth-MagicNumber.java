class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        System.out.print((MagicNumber(n)));
    }
    public static int MagicNumber(int n)
    {
        int base =5;
        int ans =0;
        while(n>0)
        {
            int last = (n &1);
            n = n >> 1;
            ans += last * base;
            base = base * 5;
            
        }
        return ans;
    }
}

OUTPUT:
130

  Explanation:
 1 = 0 0 1 ((5^3 * 0) + (5^2 *0) + (5^1 * 1)) = 0 + 0 + 5 = 5
 2 = 0 1 0 ((5^3 * 0) + (5^2 *1) + (5^1 * 0)) = 0 + 25 + 0 = 25
 3 = 0 1 1 ((5^3 * 0) + (5^2 *1) + (5^1 * 1)) = 0 + 25 + 5 = 30
 4 = 1 0 0 ((5^3 * 1) + (5^2 *0) + (5^1 * 0)) = 125 + 0 + 0 = 125
 5 = 1 0 1 ((5^3 * 1) + (5^2 *0) + (5^1 * 1)) = 125 + 0 + 5 = 30
  
