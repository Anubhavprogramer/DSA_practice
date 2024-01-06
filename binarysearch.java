import java.util.*;
public class binarysearch {
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
        System.out.println("Enter the element");
        int find = SC.nextInt();
        int index= -1;
        int start=0;
        int last=n-1;
        int mid;
        for(int i = 0;i<n;i++)
        {
            mid= (start+last)/2;
            if (arr[mid]==find)
            {
                index=mid;
                break;
            }
            else if (arr[mid]<find)
            {
                last= mid+1;
            }
            else {
                start= mid-1;
            }
        }
        if (index != -1) {
            System.out.println("We found it at:" +index );
        } else {
            System.out.println("LoL we didn't found it");
        }
    }
}