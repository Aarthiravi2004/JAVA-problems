import java.lang.*;
class Main{
    public static void main(String[] args)
    {
       int n = 4;
       for(int i=1;i< n*2;i++)
       {
           for(int j=1;j<n*2;j++)
           {
               int MinDistance = (n+1)-(Math.min(Math.min(i , j) , Math.min((n*2)-i,(n*2)-j)));
               System.out.print(MinDistance+" ");
           }
           System.out.println();
       }
       
    }
}


OUTPUT:
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
