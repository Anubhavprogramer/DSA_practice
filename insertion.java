public class insertion {
    public static void main(String[] args)
    {
        int arr[]={1,44,33,23,6,755,4,677,8};
        sort(arr);
    }
    public static void sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int current = arr[i];
            while(j>=0)
            {
                if(arr[j]>current)
                {
                    arr[j+1] = current;
                    current= arr[j];
                }
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
