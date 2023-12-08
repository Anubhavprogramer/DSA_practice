// Write a program to find the number of elements in the largest increasing sequence
// in an array.
import java.util.*;
public class codeone {

    public static int lis(int arr2[],int n)
    {
        int lisarr[] = new int [n];
        int max=1;
        for(int i=0;i<n;i++)
        {
            lisarr[i]=1;
        }

        // code to check for longest increasing array

        for(int i = 1; i<n; i++)
        {
            for(int j= 0;j<i;j++)
            {
                if(arr2[i]>arr2[j] && lisarr[i]<lisarr[j]+1)
                {
                    lisarr[i]= lisarr[j]+1;
                }
            }
            max = Math.max(max, lisarr[i]);
        }
        return max;
    }

    public static void EnterArray()
    {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = SC.nextInt();

        int arr[]= new int[n];

        System.out.println("Enter the array");
        for(int i=0 ; i<n;i++)
        {
            arr[i]= SC.nextInt();    
        }

        int answer = lis(arr, n);
        System.out.println("largest increaing array is: "+ answer);
    }

    public static void main(String[] args) {
        EnterArray();
    }    

}
