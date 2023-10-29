GCD:

class HelloWorld {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        System.out.print(gcd(a,b));
    }
    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
}
OUTPUT:
1

  
GCD and LCM:

class HelloWorld {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        System.out.print(lcm(a,b));
    }
  
    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
  
    public static int lcm(int a,int b)
    {
        return a*b / gcd(a,b);
    }
    
}

OUTPUT:
36
