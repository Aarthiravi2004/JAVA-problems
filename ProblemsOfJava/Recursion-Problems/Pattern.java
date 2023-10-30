class HelloWorld {
    public static void main(String[] args) {
        int r = 4;
        patternPrinting(4,0);
    }
    public static void patternPrinting(int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if( c < r)
        {
            patternPrinting(r,c+1);
            System.out.print("*");
        }
        else
        {
            patternPrinting(r-1,0);
            System.out.println();
            
        }
    }
}
OUTPUT:
*
**
***
****


class HelloWorld {
    public static void main(String[] args) {
        int r = 4;
        patternPrinting(4,0);
    }
    public static void patternPrinting(int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if( c < r)
        {
            System.out.print("*");
          patternPrinting(r,c+1);
        }
        else
        {
            System.out.println();
            patternPrinting(r-1,0);
        }
    }
}

OUTPUT:
****
***
**
*
