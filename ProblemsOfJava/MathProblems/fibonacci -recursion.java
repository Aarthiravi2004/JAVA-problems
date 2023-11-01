class Main{
  public static void main(String[] args){
    int n=7;
    System.out.print(fibo(n));
  }
  public static int fibo(int n){
    if(n<2)
    {
      return n;
    }else
    {
      return fibo(n-1)+fibo(n-2);
    }
  }
}

OUTPUT:
13 //sum of fibonacci from 0 to n 
