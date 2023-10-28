class Main {
     
public static void main(String arg[])
{
    int n = 16;
    System.out.print("Kth bit set number = " + 
                              rightMostSetBit(n));
}
static int rightMostSetBit(int n)
{
    return (int)((Math.log10(n & -n)) / Math.log10(2))
            + 1;
}
}

Output:
5
