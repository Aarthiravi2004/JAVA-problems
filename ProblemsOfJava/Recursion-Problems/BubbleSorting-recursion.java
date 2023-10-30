class HelloWorld {
    public static void main(String[] args) {
        int arr[] ={65,333,24,82,60,13};
        bubbleSorting(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }
    public static void  bubbleSorting(int[] arr,int i,int j)
    {
        if(i==0)
        {
            return;
        }
        if( j < i)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
            }
            bubbleSorting(arr,i,j+1);
        }
        else
        {
            bubbleSorting(arr,i-1,0);
        }
    }
}

OUTPUT:
[13, 24, 60, 65, 82, 333]
