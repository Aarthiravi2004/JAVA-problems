import java.util.*;
import java.lang.*;
public class Prime{
    Public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      System.out.print(Isprime(n));
    }
  static boolean Isprime(int n){
    int c=2;
    if(n<=1){
      return false;
    }
    while(c <= Math.sqrt(n)){    //avoiding the repeated multiplcation eg: 8*2 == 2*8
      if(n%c==0){
        return false;
      }
      c++;
    }
    retur true;
  }
}
