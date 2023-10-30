class HelloWorld {
    public static void main(String[] args) {
        int arr[] ={65,333,24,82,60,13};
        selectionSorting(arr,arr.length,0,0);
        System.out.print(Arrays.toString(arr));
    }
    public static void  selectionSorting(int[] arr,int i,int j,int max)
    {
        if( i == 0)
        {
            return;
        }
        if(j < i)
        {
            if(arr[j] > arr[max])
            {
                selectionSorting(arr,i,j+1,j);
            }
            else
            {
                selectionSorting(arr,i,j+1,max);
            }
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[j-1];
            arr[j-1] = temp;
            selectionSorting(arr,i-1,0,0);
        }
    }
}


OUTPUT:
[13, 24, 60, 65, 82, 333]
