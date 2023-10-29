class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,7};
        System.out.print(sortedOrNot(arr,0));
    }
   public static boolean sortedOrNot(int[] arr,int index)
   {
       if(index == arr.length-1)
       {
           return true;
       }
       if(arr[index] > arr[index+1])
       {
           return false;
       }
       return sortedOrNot(arr,index+1);
   }
    
}

OUTPUT:
false
