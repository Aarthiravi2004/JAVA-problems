class HelloWorld {
    public static void main(String[] args) {
        int arr[]={2,3,2,4,5,4,5,6,7,6,7};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr)
    {
        int unique = 0;
        for(int n: arr)
        {
            unique ^= n;
        }
        return unique;
    }

OUTPUT:
  3


  // this is so similar to the below problem


  class HelloWorld {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4,5,-4,-5,6,7,-6,-7};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr)
    {
        int unique = 0;
        for(int n: arr)
        {
            unique += n;
        }
        return unique;
    }
}

OUTPUT:
  3
