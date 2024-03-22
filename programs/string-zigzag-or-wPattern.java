// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int row=0;
        int k=0;
        int index=0;
        int t=0;
        while(row < n)
        {
            if(row !=0 && row<n-1)
            {
                boolean down=true;
                for(int i=index;i<str.length();)
                {
                    if(down)
                    {
                        k = ((n-row-1)*2);
                        System.out.print(str.charAt(i));
                        i+=k;
                        down=false;
                    }
                    else
                    {
                        k = ((row+n)-n+1)+t;
                        System.out.print(str.charAt(i));
                        i+=k;
                        down=true;
                    }
                    
                }
                t++;
            }
            else
            {
                k = (n-1)*2;
                for(int i=index;i<str.length();)
                {
                    System.out.print(str.charAt(i));
                    i+=k;
                }
            }
            row++;
            index++;
            
        }
    }
}
