class HelloWorld {
    public static void main(String[] args) {
         int base = 2;
         int power = 8;
        PowerProblem(base,power);
    }
    public static void PowerProblem(int base,int power)
    {
        int ans = 1;
        while(power > 0){
        if((power & 1) == 1)
        {
            ans*=base;
        }
        base *= base;
        power = power >> 1;
        }
        System.out.print(ans);
    }
}
OUTPUT:
256

Explanation:
power 8 = 1 0 0 0
  0 * 2 = 0  // base*base(2*2 = 4)
  0 * 4 = 0 // (4*4 = 16)
  0 * 16 = 0 //(16*16 = 256)
  1 * 256 = 256 // ans
  
