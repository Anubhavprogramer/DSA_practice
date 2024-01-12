// 2 Write a program to remove duplicates from an array.

import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = SC.nextInt();

        int arr[]= new int[n];

        System.out.println("Enter the array");
        for(int i=0 ; i<n;i++)
        {
            arr[i]= SC.nextInt();    
        }

        // remove duplicates of an array

        for(int i = 0; i < n;i++)
        {
            for (int j=i; j<n;j++)
            {
                if (arr[i]==arr[j]) {
                    for(int k=j+1;k<n;k++)
                    {
                        arr[k-1]=arr[k];
                    }
                    n--;
                }
            }
        }

        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+",");
        }
    }
}
