import java.lang.*;
class Main{
    public static void main(String[] args)
    {
       int n = 4;
       for(int i=1;i<=n*2;i++)
       {
           int number;
           if(i>n)
           {
               number = (n*2)-i+1;
           }
           else
           {
               number = i;
           }
           for(int space=0;space <= n-number;space++)
           {
               System.out.print("  "); //2 spaces here
           }
           
           for(int j=number;j>=1;j--)
           {
               System.out.print(j+" ");
           }
           for(int k=2;k<=number;k++)
           {
               System.out.print(k+" ");
           }
       }
       System.out.println();
    }
}



OUTPUT:
N = 4
         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
     3 2 1 2 3 
       2 1 2
         1
      
