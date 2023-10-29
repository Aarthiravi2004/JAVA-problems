import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
        int n = 40;
        factors(n);
    }
    public static void factors(int n)
    {
        
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(n%i == i){
                System.out.print(i+" ");
                }else
                {
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}

OUTPUT:
1 40 2 20 4 10 5 8 

To print it in a sorted manner

import java.lang.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n = 40;
        factors(n);
    }
    public static void factors(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(n%i == i){
                System.out.print(i+" ");
                }else
                {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i=(list.size())-1;i>=0;i--)
        {
           System.out.print(list.get(i)+" ");
        }
    }
}
OUTPUT:
1 2 4 5 8 10 20 40 


Explanation:
if i = 1 
  40 % 1 == 0 because 1*40 = 40
if i = 2
  40 % 2 == 0 because 2*20 = 40  // (40/2 = 20)
if i = 4
  40 % 4 == 0 because 4*10 = 40 // (40/4 = 10)
if i = 5
  40 % 5 == 0 because 5*8 = 40 // (40/5 = 8)
if i = 8
  40 % 4 == 0 because 8*5 = 40 // (40/8 = 5)
  
 // doesn't it seems like repeating , so we if i is divisible by n then the number which makes i to divisible by n will be also the factor of n 
  
